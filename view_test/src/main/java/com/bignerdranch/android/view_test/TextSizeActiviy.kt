package com.bignerdranch.android.view_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TextSizeActiviy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_size_activiyu)
        val textview : TextView = findViewById(R.id.tv_sp)
    }
}