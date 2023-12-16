package com.abregujuancruz.home.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abregujuancruz.home.domain.usecase.LoadHomeDataUseCase
import com.abregujuancruz.home.ui.model.HomeData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val loadHomeDataUseCase: LoadHomeDataUseCase
) : ViewModel() {

    private var _uiState: MutableStateFlow<HomeData?> = MutableStateFlow(null)
    val uiState: StateFlow<HomeData?> get() = _uiState

    init {
        loadModelData()
    }

    private fun loadModelData() {
        viewModelScope.launch {
            loadHomeDataUseCase().collect { homeData ->
                _uiState.value = homeData
            }
        }
    }
}
