package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsSports4Binding

class newsSports4 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsSports4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsSports4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}