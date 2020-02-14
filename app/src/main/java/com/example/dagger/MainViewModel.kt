package com.example.dagger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(): ViewModel() {

    @Inject
    lateinit var repository: Repository

    val data: MutableLiveData<String> = MutableLiveData()

    fun setup() {
        data.value = repository.getDate()
    }

}