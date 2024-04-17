package com.example.android_lifecycle

import android.app.Application
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner

class AndroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(object : DefaultLifecycleObserver {
            override fun onStart(owner: LifecycleOwner) {
                super.onStart(owner)
                Log.d("Jordiee", "Application in foreground")
            }

            override fun onStop(owner: LifecycleOwner) {
                super.onStop(owner)
                Log.d("Jordiee", "Application in background")
            }
        })
    }
}