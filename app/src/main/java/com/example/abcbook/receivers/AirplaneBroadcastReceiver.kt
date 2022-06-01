package com.example.abcbook.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.abcbook.util.Helper

class AirplaneBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeOn = intent!!.getBooleanExtra("state", false)
        if (isAirplaneModeOn) {
            Helper.showToast(context, "Airplane mode is tuned on")
        } else {
            Helper.showToast(context, "Airplane mode is tuned off")
        }
    }
}