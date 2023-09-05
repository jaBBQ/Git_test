package com.bignerdranch.android.android_test

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyAsyncTask(private val tv_content : TextView) : AsyncTask<Void,Void,String>() {
    override fun onPreExecute() {
        super.onPreExecute()
        tv_content.text = "正在执行任务"
    }
    override fun doInBackground(vararg params: Void?): String {
        try {
            Thread.sleep(3000)
        }catch (e : InterruptedException) {

        }
        return "执行完成"
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        tv_content.text = result
    }
}

class MainActivity : AppCompatActivity(){
    private var btn : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        val tv_content = findViewById<TextView>(R.id.tv_content)
        val myasyncTask = MyAsyncTask(tv_content)
        btn?.setOnClickListener {
            myasyncTask.execute()
        }
    }
}