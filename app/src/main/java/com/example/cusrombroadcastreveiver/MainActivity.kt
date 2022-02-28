package com.example.cusrombroadcastreveiver

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var customBroadcastReceiver: CustomBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        customBroadcastReceiver = CustomBroadcastReceiver()
        val intentFilter: IntentFilter = IntentFilter()
        intentFilter.addAction("com.example.androidcomponents")
        registerReceiver(customBroadcastReceiver, intentFilter)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(customBroadcastReceiver)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}