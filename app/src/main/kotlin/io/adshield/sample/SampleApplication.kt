package io.adshield.sample

import android.app.Application
import io.adshield.android.AdShield

class SampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AdShield.configure(endpoint = "example.com")
        AdShield.measure(this)
    }
}
