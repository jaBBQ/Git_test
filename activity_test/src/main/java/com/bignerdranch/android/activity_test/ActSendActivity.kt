package com.bignerdranch.android.activity_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActSendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_send)
        val tv_send : TextView = findViewById(R.id.tv_send)
        findViewById<Button>(R.id.btn_send).setOnClickListener {
            val intent : Intent = Intent(this, ActReceiveActivity::class.java)
            val bundle : Bundle = Bundle()
            bundle.putString("num", "123")
            bundle.putString("text", tv_send.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}