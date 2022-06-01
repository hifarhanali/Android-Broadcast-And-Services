package com.example.abcbook.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import com.example.abcbook.util.Helper


class BatteryMonitorBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent) {
        val status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1)

        val isCharging = (status == BatteryManager.BATTERY_STATUS_CHARGING) ||
                (status == BatteryManager.BATTERY_STATUS_FULL)

        if (isCharging) {
            Helper.showToast(context, "The device is charging")
        } else {
            Helper.showToast(context, "The device is not charging")
        }
    }
}