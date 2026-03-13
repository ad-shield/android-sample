package io.adshield.sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.status_text)
        textView.text = "AdShield.measure() called in Application.onCreate()\n\nCheck logcat for detection results.\nFilter by tag: AdShield"
    }
}
