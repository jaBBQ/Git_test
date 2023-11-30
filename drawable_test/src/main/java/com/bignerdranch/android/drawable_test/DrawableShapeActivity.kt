package com.bignerdranch.android.drawable_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DrawableShapeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawable_shape)
        val view : View = findViewById(R.id.v_content)
        view.setBackgroundResource(R.drawable.shape_oval_rose)
        findViewById<Button>(R.id.btn_oval).setOnClickListener {
            view.setBackgroundResource(R.drawable.shape_oval_rose)
        }
        findViewById<Button>(R.id.btn_rect).setOnClickListener {
            view.setBackgroundResource(R.drawable.shape_rect_gold)
        }
    }
}