package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsLifestyle2Binding

class newsLifestyle2 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsLifestyle2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsLifestyle2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}