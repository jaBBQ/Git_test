package com.bignerdranch.android.android_test

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){
    private var btn : Button? = null
    var tv_content : TextView? = null
    private var handler : Handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            when(msg.what) {
                0 -> {
                    tv_content?.text = msg.obj.toString()
                }
            }
            showToast()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        tv_content = findViewById(R.id.tv_content)
        btn?.setOnClickListener {
            Thread(Runnable {
                work()
            }).start()
        }
    }

    fun showToast() {
        Toast.makeText(this,"done", Toast.LENGTH_SHORT).show()
    }

    fun work() {
        var str = ""
        for (i in 1..5) {
            str += i.toString()
        }
        Thread.sleep(6000)
        var msg : Message = Message()
        msg.what = 0
        msg.obj = str
        handler.sendMessage(msg)
    }
}