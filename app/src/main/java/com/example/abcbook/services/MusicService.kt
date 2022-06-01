package com.example.abcbook.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import com.example.abcbook.util.Helper


class MusicService: Service() {
    private var player: MediaPlayer? = null
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        player!!.isLooping = true
        player!!.start()
        Helper.showToast(this.applicationContext, "Music started")
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Helper.showToast(this.applicationContext, "Music stopped")
        player!!.stop()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}