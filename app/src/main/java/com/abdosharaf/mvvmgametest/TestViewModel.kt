package com.abdosharaf.mvvmgametest

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel: ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _score

    val timer = object : CountDownTimer(60000, 1000){
        override fun onTick(millisUntilFinished: Long) {}

        override fun onFinish() {}
    }

    init {
        Log.d("TestViewModel", "ViewModel is created!!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("TestViewModel", "ViewModel is destroyed!!")
    }
}