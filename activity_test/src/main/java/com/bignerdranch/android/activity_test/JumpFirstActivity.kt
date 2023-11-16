package com.bignerdranch.android.activity_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JumpFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jump_first)
        findViewById<Button>(R.id.btn_jump_second).setOnClickListener {
            val intent : Intent = Intent(this, JumpSecondActivity::class.java)
            //栈中存在待跳转的活动时，则重新创建该活动的实例，并清除原实例上方的所有实例
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}