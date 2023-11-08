package com.bignerdranch.android.view_test

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TextColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_color)
        val textview : TextView = findViewById(R.id.tv_hello)
        textview.setTextColor(Color.BLUE)
        textview.setBackgroundColor(Color.GRAY)
    }
}