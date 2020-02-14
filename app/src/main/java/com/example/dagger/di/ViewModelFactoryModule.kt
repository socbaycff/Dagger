package com.example.dagger.di

import androidx.lifecycle.ViewModelProvider
import com.example.dagger.temp.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
// bind factory cho tat ca viewmodel
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory): ViewModelProvider.Factory

}
