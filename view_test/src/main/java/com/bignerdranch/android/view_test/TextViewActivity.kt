package com.bignerdranch.android.view_test

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TextViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)
        val textview : TextView = findViewById(R.id.tv_hello)
        textview.text = "世界你好"
    }
}