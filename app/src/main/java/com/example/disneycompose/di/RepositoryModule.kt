package com.example.disneycompose.di


import com.example.disneycompose.network.DisneyService
import com.example.disneycompose.persistence.PosterDao
import com.example.disneycompose.ui.main.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun provideMainRepository(
        disneyService: DisneyService,
        posterDao: PosterDao
    ): MainRepository {
        return MainRepository(disneyService, posterDao)
    }
}