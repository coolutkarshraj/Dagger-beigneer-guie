package com.io.utkarsh.daggerbeigneerguide

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor() : Battery{
    override fun getPower() {
        Log.i(NickelCadmiumBattery::class.simpleName,"Power for nickel cadmium")
    }
}