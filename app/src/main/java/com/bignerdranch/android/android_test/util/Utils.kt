package com.bignerdranch.android.android_test.util

import android.content.Context

class Utils {
    companion object{
        fun dip2px(context: Context, dpValue : Float) : Int{
            //获取手机像素密度
            val scale = context.resources.displayMetrics.density
            return (dpValue * scale + 0.5f).toInt()
        }
    }
}