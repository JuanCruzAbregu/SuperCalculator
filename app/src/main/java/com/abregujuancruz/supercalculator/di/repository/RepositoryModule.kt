package com.abregujuancruz.supercalculator.di.repository

import com.abregujuancruz.supercalculator.usecase.home.data.repository.HomeContract
import com.abregujuancruz.supercalculator.usecase.home.data.repository.HomeRepository
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Reusable
    abstract fun bindHomeRepository(homeRepository: HomeRepository): HomeContract

}