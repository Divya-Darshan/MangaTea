// app/src/main/java/com/darshniDev/mangatea/ui/MainActivity.kt
package com.darshniDev.mangatea.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.darshniDev.mangatea.R

/**
 * MainActivity serves as the primary entry point for the MangaTea UI.
 * Following Clean Architecture, this class is restricted to UI orchestration.
 */
class MainActivity : AppCompatActivity() {

    // XML View IDs: camelCase prefixed by component abbreviation (tvStatus)
    private var tvStatus: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeViews()
        setupStatusText()
    }

    /**
     * Initializes UI components and binds them to local variables.
     */
    private fun initializeViews() {
        tvStatus = findViewById(R.id.tvStatus)
    }

    /**
     * Updates the status message on the screen.
     * Uses modern Kotlin safe calls to ensure null-safety.
     */
    private fun setupStatusText() {
        // Safe call operator ?. used to prevent potential NullPointerExceptions
        tvStatus?.text = getString(R.string.welcome_message)
    }
}
