package com.example.dagger

import javax.inject.Inject

class Repository @Inject constructor() {
    @Inject
    lateinit var data: String

    fun getDate(): String {
        return data
    }

}