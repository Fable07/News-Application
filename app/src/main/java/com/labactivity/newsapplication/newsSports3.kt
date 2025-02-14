package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsSports3Binding

class newsSports3 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsSports3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsSports3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}