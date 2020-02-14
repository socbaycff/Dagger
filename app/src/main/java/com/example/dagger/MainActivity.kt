package com.example.dagger

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.dagger.temp.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(
            this,
            providerFactory as ViewModelProvider.Factory
        ).get(MainViewModel::class.java)
        viewModel.setup()

        Log.i("testttt",viewModel.data.value)
    }
}
