package com.io.utkarsh.daggerbeigneerguide

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init {
        Log.i(ServiceProvider::class.simpleName,"Service provider Constructed")
    }

    fun getServiceProvider(){
        Log.i(ServiceProvider::class.simpleName,"Service provider Connected")
    }
}