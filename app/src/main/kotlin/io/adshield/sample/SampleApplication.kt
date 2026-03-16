package io.adshield.sample

import android.app.Application
import io.adshield.android.AdShield

class SampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AdShield.configure(endpoint = "https://cdn.jsdelivr.net/gh/ad-shield/c/config.txt")
        AdShield.measure(this)
    }
}
