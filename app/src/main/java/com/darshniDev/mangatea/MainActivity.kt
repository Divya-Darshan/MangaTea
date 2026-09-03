package com.darshniDev.mangatea

import com.darshniDev.mangatea.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the TextView by its correct ID 'tvStatus' from activity_main.xml
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        tvStatus?.text = "Vanakkam! MangaTea is Ready 🍵"
    }
}
