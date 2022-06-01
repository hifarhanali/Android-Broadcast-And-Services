package com.example.abcbook

import android.Manifest
import android.app.ActivityManager
import android.bluetooth.BluetoothAdapter
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.abcbook.letteractivity.ALetterActivity
import com.example.abcbook.receivers.AirplaneBroadcastReceiver
import com.example.abcbook.receivers.BatteryMonitorBroadcastReceiver
import com.example.abcbook.receivers.BluetoothBroadcastReceiver
import com.example.abcbook.services.MusicService
import com.example.abcbook.util.Helper


class MainActivity : AppCompatActivity() {


    private lateinit var batteryReceiver: BatteryMonitorBroadcastReceiver
    private lateinit var bluetoothReceiver: BluetoothBroadcastReceiver
    private lateinit var airplaneModeReceiver: AirplaneBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set click event listener on start button
        setOnStartButtonClicked()

        // setup permissions
        setupPermissions()

        // register broadcast receivers
        registerBroadcastReceivers()
    }

    override fun onRestart() {
        super.onRestart()

        if (isServiceRunning(MusicService::class.java)) {
            // stop service
            stopService(Intent(this, MusicService::class.java))
        }
    }

    private fun isServiceRunning(serviceClass: Class<*>): Boolean {
        val manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if (serviceClass.name == service.service.className) {
                return true
            }
        }
        return false
    }

    private fun registerBroadcastReceivers() {
        registerBatteryBroadcastReceiver()
        registerBluetoothBroadcastReceiver()
        registerAirplaneModeBroadcastReceiver()
    }

    private fun registerAirplaneModeBroadcastReceiver() {
        airplaneModeReceiver = AirplaneBroadcastReceiver()
        registerReceiver(airplaneModeReceiver, IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED))
    }

    private fun registerBluetoothBroadcastReceiver() {
        bluetoothReceiver = BluetoothBroadcastReceiver()
        registerReceiver(bluetoothReceiver, IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED))
    }

    private fun registerBatteryBroadcastReceiver() {
        batteryReceiver = BatteryMonitorBroadcastReceiver()
        registerReceiver(batteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }


    private fun setupPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_DENIED
                || checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_DENIED
            ) {
                requestPermissions(permissionsToRequest, PERMISSIONS_REQUEST_CODE)
            }
        }
    }

    // set click event listener on start button
    private fun setOnStartButtonClicked() {
        Log.i(TAG, "setOnStartButtonClicked: called")
        val startButton = findViewById<Button>(R.id.start_button)
        startButton.setOnClickListener {
            // start service
            startService(Intent(this, MusicService::class.java))
            startActivity(Intent(this, ALetterActivity::class.java))
        }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            PERMISSIONS_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Helper.showToast(this, "Permission granted: $PERMISSIONS_REQUEST_CODE")
                } else {
                    Helper.showToast(this, "Permission NOT granted: $PERMISSIONS_REQUEST_CODE")
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterBroadcastReceivers()
    }

    private fun unregisterBroadcastReceivers() {
        unregisterReceiver(batteryReceiver)
        unregisterReceiver(bluetoothReceiver)
        unregisterReceiver(airplaneModeReceiver)
    }


    companion object {
        private const val TAG = "MainActivity"
        private const val PERMISSIONS_REQUEST_CODE = 100
        val permissionsToRequest = arrayOf(
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.CALL_PHONE,
            Manifest.permission.READ_CALL_LOG
        )

    }
}
