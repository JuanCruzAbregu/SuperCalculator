package com.abregujuancruz.home.domain.usecase

import com.abregujuancruz.home.data.repository.HomeRepository
import com.abregujuancruz.home.ui.model.HomeData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoadHomeDataUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) {
    suspend operator fun invoke(): Flow<HomeData> {
        return homeRepository.recoverDataFromBase64()
    }
}
