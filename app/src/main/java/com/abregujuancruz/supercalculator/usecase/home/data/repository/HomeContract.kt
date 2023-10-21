package com.abregujuancruz.supercalculator.usecase.home.data.repository

import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import kotlinx.coroutines.flow.Flow

interface HomeContract {

    suspend fun recoverDataFromBase64(): Flow<HomeData>

}