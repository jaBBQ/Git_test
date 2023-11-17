package com.bignerdranch.android.activity_test

import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MetaDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meta_data)
        val tv_meta : TextView = findViewById(R.id.tv_meta)
        val pm : PackageManager = packageManager
        val info : ActivityInfo = pm.getActivityInfo(componentName, PackageManager.GET_META_DATA)
        var bundle = info.metaData
        var weather = bundle.getString("weather")
        tv_meta.text = weather
    }
}