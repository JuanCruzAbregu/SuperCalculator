package com.abregujuancruz.home.data.repository

import android.util.Base64
import com.abregujuancruz.database.Database.DATA_BASE64
import com.abregujuancruz.home.ui.model.HomeData
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeRepository @Inject constructor() : HomeContract {
    override suspend fun recoverDataFromBase64(): Flow<HomeData> {
        return withContext(Dispatchers.IO) {
            flowOf(
                Gson().fromJson(
                    String(Base64.decode(DATA_BASE64, Base64.DEFAULT)),
                    HomeData::class.java
                )
            )
        }
    }
}
