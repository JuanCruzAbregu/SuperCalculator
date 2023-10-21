package com.abregujuancruz.supercalculator.usecase.home.domain.usecase

import com.abregujuancruz.supercalculator.usecase.home.data.repository.HomeRepository
import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject


class LoadHomeDataUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) {
    suspend operator fun invoke(): Flow<HomeData> {
        return withContext(Dispatchers.IO) {
            homeRepository.recoverDataFromBase64()
        }
    }
}