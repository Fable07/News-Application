package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsSports2Binding

class newsSports2 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsSports2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsSports2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}