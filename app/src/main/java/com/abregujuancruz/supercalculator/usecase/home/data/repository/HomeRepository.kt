package com.abregujuancruz.supercalculator.usecase.home.data.repository

import android.util.Base64
import com.abregujuancruz.supercalculator.usecase.home.data.db.Database.DATA_BASE64
import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeRepository @Inject constructor() : HomeContract {
    override suspend fun recoverDataFromBase64(): HomeData {
        return withContext(Dispatchers.IO) {
            Gson().fromJson(
                String(Base64.decode(DATA_BASE64, Base64.DEFAULT)),
                HomeData::class.java
            )
        }
    }
}
