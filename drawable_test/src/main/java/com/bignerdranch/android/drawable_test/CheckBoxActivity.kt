package com.bignerdranch.android.drawable_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton

class CheckBoxActivity : AppCompatActivity(),
    CompoundButton.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
        findViewById<CheckBox>(R.id.ck_custom).setOnCheckedChangeListener(this)
        findViewById<CheckBox>(R.id.ck_system).setOnCheckedChangeListener(this)

    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        val desc = String.format("您%s了这个checkbox",if (isChecked) "勾选" else "取消勾选")
        buttonView?.text = desc
    }
}