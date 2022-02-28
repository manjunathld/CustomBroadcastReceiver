package com.example.cusrombroadcastreveiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class CustomBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent!!.action!!.equals("ACTION_INTENT_CUSTOM_MESSAGE")) {
            Toast.makeText(context, "ACTION_INTENT_CUSTOM_MESSAGE", Toast.LENGTH_SHORT).show()
            Log.e("mmm", "ACTION_INTENT_CUSTOM_MESSAGE")
        }
    }
}