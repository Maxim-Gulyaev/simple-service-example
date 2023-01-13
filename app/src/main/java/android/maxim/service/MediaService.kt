package android.maxim.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder


class MediaService: Service() {

    private lateinit var myMediaPlayer: MediaPlayer

    override fun onBind(intent: Intent?): IBinder? {
        throw UnsupportedOperationException("This operation are not implemented")
    }

    override fun onCreate() {
        myMediaPlayer = MediaPlayer.create(this, R.raw.music)
        myMediaPlayer.isLooping = true
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        myMediaPlayer.start()
        return START_STICKY
    }

    override fun onDestroy() {
        myMediaPlayer.stop()
    }
}