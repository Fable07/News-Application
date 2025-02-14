package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsLifestyle1Binding

class newsLifestyle1 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsLifestyle1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsLifestyle1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}