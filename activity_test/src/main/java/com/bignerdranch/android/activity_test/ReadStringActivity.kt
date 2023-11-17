package com.bignerdranch.android.activity_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReadStringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_string)
        val tv_resource : TextView = findViewById(R.id.tv_resouce)
        tv_resource.text = getString(R.string.weather)
    }
}