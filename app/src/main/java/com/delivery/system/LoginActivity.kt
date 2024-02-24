package com.delivery.system

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener{
            val loginText = findViewById<EditText>(R.id.loginInput).text.toString()
            val intent = Intent(this, HomeActivity::class.java).apply {
                putExtra("Login", loginText)
            }
            startActivity(intent)
        }
    }
}