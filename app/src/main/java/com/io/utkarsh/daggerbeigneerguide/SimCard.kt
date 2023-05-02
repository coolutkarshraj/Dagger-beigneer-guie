package com.io.utkarsh.daggerbeigneerguide

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    init {
        Log.i(Battery::class.simpleName, "Sim Card Constructor")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}