package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsSports1Binding

class newsSports1 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsSports1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsSports1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}