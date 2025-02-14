package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsLifestyle4Binding

class newsLifestyle4 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsLifestyle4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsLifestyle4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}