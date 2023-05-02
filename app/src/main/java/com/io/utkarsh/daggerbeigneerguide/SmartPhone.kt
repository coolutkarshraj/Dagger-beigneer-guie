package com.io.utkarsh.daggerbeigneerguide

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(
    private val battery: Battery, private val simCard: SimCard, private val memoryCard
    : MemoryCard
) {

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i(SmartPhone::class.simpleName, "Smart Phone Constructed")
    }

    fun makeACallWithRecording() {
        Log.i(SmartPhone::class.simpleName, "Calling....")
    }
}