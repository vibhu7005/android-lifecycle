package com.example.android_lifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), ConfigChangeFragment.DataSubmittedCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            val fragment = ConfigChangeFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .add(R.id.frameLayout, fragment, "fdf")
                .commit()
        }
    }

    override fun onDataSubmitted() {
        Toast.makeText(this, "Data updated on fragment", Toast.LENGTH_SHORT).show()
    }
}