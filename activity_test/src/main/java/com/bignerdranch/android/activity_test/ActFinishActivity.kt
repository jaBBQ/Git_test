package com.bignerdranch.android.activity_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ActFinishActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_finish)
        findViewById<Button>(R.id.btn_back).setOnClickListener(this)
        findViewById<Button>(R.id.btn_finish).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        finish()
    }
}