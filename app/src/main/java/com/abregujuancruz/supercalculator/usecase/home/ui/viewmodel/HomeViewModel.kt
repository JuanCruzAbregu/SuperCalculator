package com.abregujuancruz.supercalculator.usecase.home.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abregujuancruz.supercalculator.usecase.home.domain.usecase.LoadHomeDataUseCase
import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val loadHomeDataUseCase: LoadHomeDataUseCase
) : ViewModel() {

    private var _homeData: MutableStateFlow<HomeData?> = MutableStateFlow(null)
    val homeData: StateFlow<HomeData?> get() = _homeData

    init {
        loadModelData()
    }

    private fun loadModelData() {
        viewModelScope.launch {
            loadHomeDataUseCase.invoke().collect { data ->
                _homeData.value = data
            }
        }
    }
}