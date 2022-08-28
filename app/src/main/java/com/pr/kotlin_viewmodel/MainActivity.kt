package com.pr.kotlin_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview=findViewById(R.id.textview1) as TextView

        textview.text="axax"

        val mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)


        mainViewModel.livedata.observe(this,{
            textview.text=it
        })




    }
}