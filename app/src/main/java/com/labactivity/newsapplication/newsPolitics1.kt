package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsPolitics1Binding

class newsPolitics1 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsPolitics1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsPolitics1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}