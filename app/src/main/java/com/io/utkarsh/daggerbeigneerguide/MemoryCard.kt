package com.io.utkarsh.daggerbeigneerguide

import android.util.Log
import javax.inject.Inject

class MemoryCard {
    init {
        Log.i(MemoryCard::class.simpleName,"Memory card constructed")
    }

    fun getSpaceAvailability(){
        Log.i(MemoryCard::class.simpleName,"Memory Space availiable")
    }
}