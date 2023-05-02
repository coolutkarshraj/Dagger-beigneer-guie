package com.io.utkarsh.daggerbeigneerguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApplication).smartPhoneComponent.inject(this)
        smartPhone.makeACallWithRecording()
    }
}