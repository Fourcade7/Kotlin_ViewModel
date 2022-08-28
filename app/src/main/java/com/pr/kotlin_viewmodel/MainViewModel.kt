package com.pr.kotlin_viewmodel

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(application: Application):AndroidViewModel(application){

    val livedata=MutableLiveData<String>()
    init {
        starttimer()
    }
    fun starttimer(){
        val timer=object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                livedata.value="${millisUntilFinished/1000}"
            }
            override fun onFinish() {
                Toast.makeText(getApplication(),"Tugadi",Toast.LENGTH_SHORT).show()
            }
        }
        timer.start()
    }

}