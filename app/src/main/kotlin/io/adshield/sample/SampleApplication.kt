package io.adshield.sample

import android.app.Application
import io.adshield.android.AdShield

class SampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AdShield.configure(endpoint = "https://joungjin-echo-to-slack-adshield.adshield.workers.dev/echo-config")
        AdShield.measure(this)
    }
}
