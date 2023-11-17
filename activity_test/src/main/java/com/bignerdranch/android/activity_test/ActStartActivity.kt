package com.bignerdranch.android.activity_test

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.core.view.KeyEventDispatcher.Component

class ActStartActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        val TAG = "ActStartActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_act_start)
        findViewById<Button>(R.id.btn_next).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
//        1. 构造函数
//        val intent : Intent = Intent(this, ActFinishActivity::class.java)
//        2. 调用对象的setClass方法指定
        val intent : Intent = Intent()
//        intent.setClass(this, ActFinishActivity::class.java)
//        3. 调用意图对象的setComponent方法指定
        val component : ComponentName = ComponentName(this, ActFinishActivity::class.java)
        intent.setComponent(component)
        startActivity(intent)
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }
}