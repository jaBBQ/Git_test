package com.bignerdranch.android.android_test

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    private var btn : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        val tv_content = findViewById<TextView>(R.id.tv_content)
        val thread = Thread {
            Thread.sleep(6000)
            runOnUiThread {
                tv_content.text = "已完成"
            }
        }
        btn?.setOnClickListener {
            Toast.makeText(this,"开始",Toast.LENGTH_SHORT).show()
            thread.start()
            Toast.makeText(this,"完成",Toast.LENGTH_SHORT).show()
        }
    }
}