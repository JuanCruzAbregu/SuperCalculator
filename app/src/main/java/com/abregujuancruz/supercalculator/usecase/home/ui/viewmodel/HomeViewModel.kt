package com.abregujuancruz.supercalculator.usecase.home.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abregujuancruz.supercalculator.usecase.home.domain.usecase.LoadHomeDataUseCase
import com.abregujuancruz.supercalculator.usecase.home.ui.model.ActionButton
import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val loadHomeDataUseCase: LoadHomeDataUseCase
) : ViewModel() {

    private var _homeData = MutableLiveData<HomeData>()
    val homeData: LiveData<HomeData> get() = _homeData

    private var _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result

    private var _function = MutableLiveData<String>()
    val function: LiveData<String> get() = _function


    private var _firstProductPrice = MutableLiveData<String>()
    val firstProductPrice: LiveData<String> get() = _firstProductPrice

    private var _firstProductQuantity = MutableLiveData<String>()
    val firstProductQuantity: LiveData<String> get() = _firstProductQuantity

    private var _secondProductPrice = MutableLiveData<String>()
    val secondProductPrice: LiveData<String> get() = _secondProductPrice

    private var _secondProductQuantity = MutableLiveData<String>()
    val secondProductQuantity: LiveData<String> get() = _secondProductQuantity

    private var _enableCalculate = MutableLiveData<Boolean>()
    val enableCalculate: LiveData<Boolean> get() = _enableCalculate

    companion object {
        private const val EMPTY = ""
    }

    init {
        loadModelData()
    }

    private fun loadModelData() {
        viewModelScope.launch {
            _homeData.postValue(
                loadHomeDataUseCase.invoke()
            )
        }
    }

    fun setOnClickByType(button: ActionButton) {
        viewModelScope.launch {
            if (button.isPrimaryButton()) {
                setOnClickPrimary()
            } else {
                _result.value = EMPTY
                _function.value = EMPTY
                _secondProductPrice.value = EMPTY
                _firstProductPrice.value = EMPTY
                _secondProductQuantity.value = EMPTY
                _firstProductQuantity.value = EMPTY
            }
        }
    }

    private fun setOnClickPrimary() {

        if (!_firstProductPrice.value.isNullOrEmpty() &&
            !_secondProductQuantity.value.isNullOrEmpty() &&
            !_firstProductQuantity.value.isNullOrEmpty() &&
            !_secondProductQuantity.value.isNullOrEmpty()
        ) {
            val firstPrice = _firstProductPrice.value!!.toDouble()
            val firstQuantity = _firstProductQuantity.value!!.toInt()
            val secondPrice = _secondProductPrice.value!!.toDouble()
            val secondQuantity = _secondProductQuantity.value!!.toInt()

            val total = firstPrice / firstQuantity
            val total2 = secondPrice / secondQuantity

            if (total < total2) {
                _result.value = "El primer producto es más económico"
                _function.value =
                    "$" + String.format("%.2f", total) + " < $" + String.format("%.2f", total2)
            } else {
                _result.value = "El segundo producto es más económico"
                _function.value =
                    "$" + String.format("%.2f", total2) + " < $" + String.format("%.2f", total)
            }
        }
    }

    fun onTextFieldChange(firstProductPrice: String, secondProductPrice: String, firstQuantity: String, secondQuantity: String) {
        _firstProductPrice.value = firstProductPrice
        _secondProductPrice.value = secondProductPrice
        _firstProductQuantity.value = firstQuantity
        _secondProductQuantity.value = secondQuantity
        _enableCalculate.value = isValidProduct(firstProductPrice) && isValidProduct(secondProductPrice)
    }

    private fun isValidProduct(product: String): Boolean = product != ""

}

