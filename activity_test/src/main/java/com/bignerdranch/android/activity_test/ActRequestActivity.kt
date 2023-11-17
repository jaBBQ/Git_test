package com.bignerdranch.android.activity_test

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class ActRequestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_request)
        val tv_request : TextView = findViewById(R.id.tv_request)
        tv_request.text = "request 123"

        var register = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult(),
            ActivityResultCallback {
                if (it != null) {
                    val intent : Intent? = it.data
                    if (it.resultCode == Activity.RESULT_OK) {
                        val bundle : Bundle? = intent?.extras
                        val response = bundle?.getString("response")
                        tv_request.text = response
                    }
                }
            })

        findViewById<Button>(R.id.btn_request).setOnClickListener {
            val intent : Intent = Intent(this, ActResponseActivity::class.java)
            val bundle : Bundle = Bundle()
            bundle.putString("request", "request 123")
            intent.putExtras(bundle)
            register.launch(intent)
        }
    }
}