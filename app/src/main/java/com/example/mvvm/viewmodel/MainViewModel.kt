package com.example.mvvm.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class MainViewModel : ViewModel() {
    val name = MutableLiveData<String>()
    val status = MutableLiveData<String>()

    init {
        name.value = "MyName"
        status.value = "haha"
    }

    fun nameClick() {
        name.value = "haye"
    }
}