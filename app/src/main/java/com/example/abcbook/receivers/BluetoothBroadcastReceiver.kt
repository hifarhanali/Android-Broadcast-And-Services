package com.example.abcbook.receivers

import android.bluetooth.BluetoothAdapter
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.abcbook.util.Helper


class BluetoothBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent!!.action

        if (action == BluetoothAdapter.ACTION_STATE_CHANGED) {
            val state = intent!!.getIntExtra(
                BluetoothAdapter.EXTRA_STATE,
                BluetoothAdapter.ERROR
            )
            when (state) {
                BluetoothAdapter.STATE_OFF -> Helper.showToast(context, "Bluetooth off")
                BluetoothAdapter.STATE_TURNING_OFF -> Helper.showToast(context, "Turning Bluetooth off...")
                BluetoothAdapter.STATE_ON -> Helper.showToast(context, "Bluetooth on")
                BluetoothAdapter.STATE_TURNING_ON -> Helper.showToast(context, "Turning Bluetooth on...")
            }
        }

    }
}