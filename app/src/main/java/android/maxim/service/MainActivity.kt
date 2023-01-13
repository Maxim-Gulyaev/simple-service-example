package android.maxim.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var btnStart: Button
    private lateinit var btnStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btn_start)
        btnStop = findViewById(R.id.btn_stop)
        btnStart.setOnClickListener(this)
        btnStop.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, MediaService::class.java)
        when (v) {
            btnStart -> startService(intent)
            btnStop -> stopService(intent)
        }
    }
}