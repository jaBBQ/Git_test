package com.bignerdranch.android.view_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ButtonEnableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_enable)
        val btn_true : Button = findViewById(R.id.btn_true)
        val btn_false : Button = findViewById(R.id.btn_false)
        val btn_test : Button = findViewById(R.id.btn_test)
        val tv_test : TextView = findViewById(R.id.tv_test)
        btn_true.setOnClickListener {
            btn_test.isEnabled = true;
        }

        btn_false.setOnClickListener {
            btn_test.isEnabled = false;
        }

        btn_test.setOnClickListener {
            tv_test.text = "测试成功"
        }
    }
}