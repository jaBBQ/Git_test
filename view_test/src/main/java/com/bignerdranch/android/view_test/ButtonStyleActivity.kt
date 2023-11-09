package com.bignerdranch.android.view_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ButtonStyleActivity : AppCompatActivity() {
    private var textview : TextView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_style)
        textview = findViewById(R.id.tv_result)
    }

    fun doClick(view : View) {
        textview?.text = "你好"
    }
}