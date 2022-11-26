package com.confidenceb.beesmartwordassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.signInbtn).setOnClickListener { view ->
            val activityIntent = Intent(this, LoginPage::class.java)
            startActivity(activityIntent)
        }

        findViewById<Button>(R.id.signupbtn).setOnClickListener { view ->
            val activityIntent = Intent(this, SignUpPage::class.java)
            startActivity(activityIntent)
        }
    }
}