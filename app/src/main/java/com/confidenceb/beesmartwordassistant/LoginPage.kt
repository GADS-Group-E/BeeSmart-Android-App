package com.confidenceb.beesmartwordassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.confidenceb.beesmartwordassistant.R

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        findViewById<Button>(R.id.login).setOnClickListener { view ->
            val activityIntent = Intent(this, HomeActivity::class.java)
            startActivity(activityIntent)
        }
    }
}