package com.abregujuancruz.supercalculator.usecase.home.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abregujuancruz.supercalculator.usecase.home.domain.usecase.LoadHomeDataUseCase
import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val loadHomeDataUseCase: LoadHomeDataUseCase
) : ViewModel() {


    private var _homeData: MutableLiveData<HomeData> = MutableLiveData()
    val homeData: LiveData<HomeData> get() = _homeData

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
}

