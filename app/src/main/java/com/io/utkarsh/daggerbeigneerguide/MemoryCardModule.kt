package com.io.utkarsh.daggerbeigneerguide

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(private val memorySize: Int) {


    //it is recommended to  don't use instance variable because it can leads to unexpected behaviour

    @Provides
    fun providesMemoryCard() : MemoryCard{
        Log.i(MemoryCardModule::class.simpleName,"Size of memory is $memorySize")
        return MemoryCard()
    }
}