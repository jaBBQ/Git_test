package com.bignerdranch.android.view_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ButtonClickActivity : AppCompatActivity() ,View.OnClickListener{
    private var tv : TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_click)
        val btn : Button = findViewById(R.id.btn_click_single)
        val btn_long : Button = findViewById(R.id.btn_long_click)
        btn_long.setOnLongClickListener {
            Toast.makeText(this, "长点击事件",Toast.LENGTH_SHORT).show()
            true
        }
        tv = findViewById(R.id.tv_click)
        btn.setOnClickListener(this)
    }

    companion object {
        class MyClickListener(tv: TextView) : View.OnClickListener {
            private var tv_result : TextView ?= null
            init {
                tv_result = tv
            }
            override fun onClick(v: View?) {
                tv_result?.text = "text发生了改变"
            }

        }
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_click_single) {
            tv?.text = "全部发生改变"
        }
    }
}