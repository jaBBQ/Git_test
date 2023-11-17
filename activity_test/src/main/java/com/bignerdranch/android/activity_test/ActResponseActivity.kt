package com.bignerdranch.android.activity_test

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActResponseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_response)
        val tv_request : TextView = findViewById(R.id.tv_request)
        val bundle : Bundle? = intent.extras
        val text : String = bundle?.getString("request").toString()
        tv_request.text = text
        findViewById<Button>(R.id.btn_response).setOnClickListener {
            val intent : Intent = Intent()
            val bundle : Bundle = Bundle()
            bundle.putString("response", "response123456")
            intent.putExtras(bundle)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        findViewById<TextView>(R.id.tv_response).text = "response123456"
    }
}