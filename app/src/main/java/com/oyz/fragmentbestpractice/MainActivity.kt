package com.oyz.fragmentbestpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * fragment最佳实践一个简单的新闻应用
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}