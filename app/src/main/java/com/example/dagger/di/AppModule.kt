package com.example.dagger.di

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideString() = "some String"
}