package com.bignerdranch.android.activity_test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.net.URL

class ActionUriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_uri)
        findViewById<Button>(R.id.btn_dial).setOnClickListener {
            val intent : Intent = Intent()
            intent.action = Intent.ACTION_DIAL
            val uri : Uri = Uri.parse("tel:12345")
            intent.setData(uri)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_sms).setOnClickListener {
            val intent : Intent = Intent()
            intent.action = Intent.ACTION_SENDTO
            val uri : Uri = Uri.parse("smsto:464946464")
            intent.setData(uri)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_my).setOnClickListener {
            val intent : Intent = Intent()
            intent.action = "android.intent.action.NING"
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            startActivity(intent)
        }
    }
}