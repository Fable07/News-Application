package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsLifestyle3Binding

class newsLifestyle3 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsLifestyle3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsLifestyle3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}