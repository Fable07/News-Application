package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsPolitics3Binding

class newsPolitics3 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsPolitics3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsPolitics3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}