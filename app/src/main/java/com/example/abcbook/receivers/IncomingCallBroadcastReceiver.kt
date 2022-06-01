package com.example.abcbook.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import com.example.abcbook.util.Helper


class IncomingCallBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        try {
            val state = intent.getStringExtra(TelephonyManager.EXTRA_STATE)
            val number = intent.extras!!.getString(TelephonyManager.EXTRA_INCOMING_NUMBER)
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING, ignoreCase = true)) {
                try {
                    Helper.showPhoneMessage(context, "Ringing the call from", number)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                Helper.showPhoneMessage(context, "Ring", number)
            }
            if (state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK, ignoreCase = true)) {
                Helper.showPhoneMessage(context, "Answered", number)
            }
            if (state.equals(TelephonyManager.EXTRA_STATE_IDLE, ignoreCase = true)) {
                Helper.showPhoneMessage(context, "Idle", number)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}