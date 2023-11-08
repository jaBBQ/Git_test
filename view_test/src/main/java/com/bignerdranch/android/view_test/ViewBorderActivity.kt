package com.bignerdranch.android.view_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import com.bignerdranch.android.view_test.util.Utils

class ViewBorderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_border)
        val textview : TextView = findViewById(R.id.tv_hello)
        val params = textview.layoutParams
        params.width = Utils.dip2px(this, 300f)
        textview.layoutParams = params
    }
}