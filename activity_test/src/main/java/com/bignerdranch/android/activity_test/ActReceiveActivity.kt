package com.bignerdranch.android.activity_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActReceiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_receive)
        val tv_reve = findViewById<TextView>(R.id.tv_reveive)
        val bundle : Bundle? = intent.extras
        val num = bundle?.getString("num")
        val text = bundle?.getString("text")
        tv_reve.text = text
    }
}