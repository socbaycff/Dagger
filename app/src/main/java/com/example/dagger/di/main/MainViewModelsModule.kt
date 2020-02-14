package com.example.dagger.di.main

import androidx.lifecycle.ViewModel
import com.example.dagger.MainViewModel
import com.example.dagger.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey( MainViewModel::class )
    abstract fun bindMainViewModel( mainViewModel: MainViewModel ): ViewModel
    // tat ca viewmodel deu phai bind vao map
}
