package com.labactivity.newsapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //new way = view binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            val topics = Intent(this, newsTopics::class.java)

            var user:String = "admin123"
            var pass:String = "adminpass123"

            var username: String = binding.usernameEditTxt.text.toString()
            var password: String = binding.passwordEditTxt.text.toString()

            if (password == pass) {
                Toast.makeText(applicationContext, "Logging in...", Toast.LENGTH_SHORT).show()
                startActivity(topics)

            } else if (username == user) {
                Toast.makeText(applicationContext, "Logging in...", Toast.LENGTH_SHORT).show()
                startActivity(topics)

            } else if (username >= user) {
                Toast.makeText(applicationContext, "Invalid Username and Password", Toast.LENGTH_SHORT).show()

            } else if (password >= pass) {
                Toast.makeText(applicationContext, "Invalid Username and Password", Toast.LENGTH_SHORT).show()

            }else {
                Toast.makeText(applicationContext, "Please Enter Username and/or Password", Toast.LENGTH_SHORT).show()

            }

        }

    }
}
