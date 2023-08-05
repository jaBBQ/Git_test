package com.bignerdranch.android.android_test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.view.View.OnLongClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.android_test.util.Utils

class MainActivity : AppCompatActivity(), View.OnClickListener{
    var btn_1 : Button? = null
    var btn_2 : Button? = null
    var hello : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_1 = findViewById<Button>(R.id.btn_1)
        btn_2 = findViewById<Button>(R.id.btn_2)
        hello = findViewById<Button>(R.id.hello)
        btn_1?.setOnClickListener(this)
        btn_2?.setOnClickListener(this)
        hello?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        when(id){
            R.id.btn_1 -> {
                hello?.isEnabled = false
            }
            R.id.btn_2 -> {
                hello?.isEnabled = false
            }
            R.id.hello -> {
                hello?.setText("world")
            }
        }

    }
}