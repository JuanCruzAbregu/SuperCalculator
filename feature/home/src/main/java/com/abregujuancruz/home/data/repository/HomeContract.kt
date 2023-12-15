package com.abregujuancruz.home.data.repository

import com.abregujuancruz.home.ui.model.HomeData
import kotlinx.coroutines.flow.Flow

interface HomeContract {

    suspend fun recoverDataFromBase64(): Flow<HomeData>

}
