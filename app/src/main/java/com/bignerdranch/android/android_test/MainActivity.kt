package com.bignerdranch.android.android_test

import android.animation.ValueAnimator
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv : TextView  = findViewById(R.id.tv)
        tv.text = "hello world"
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent: Intent = Intent()
            intent.setClass(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}