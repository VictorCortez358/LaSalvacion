package com.valenzuela.ganadorteam

import android.provider.Settings.Global.getInt
import android.provider.Settings.Global.getString
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val teamAScore = MutableLiveData("0")
    val teamBScore = MutableLiveData("0")
    val winner = MutableLiveData("")


}