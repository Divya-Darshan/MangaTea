package com.darshniDev.mangatea

import com.darshniDev.mangatea.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Using safe call operator ?. so it will NEVER crash if nulldfsdfsdfsdf just ignor
        val myTextView = findViewById<TextView>(R.id.myTextView)
        myTextView?.text = "Vanakkam! MangaTea is Ready 🍵"
    }
}