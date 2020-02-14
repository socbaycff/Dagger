package com.example.dagger.di

import android.app.Application
import com.example.dagger.di.main.MainViewModelsModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

@Component(modules = [AndroidSupportInjectionModule::class,
    MainViewModelsModule::class,
    AppModule::class,
    ActivityBuilderModule::class,
    ViewModelFactoryModule::class
    ])
interface AppComponent: AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }
}