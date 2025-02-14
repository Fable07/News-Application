package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsPolitics4Binding

class newsPolitics4 : AppCompatActivity() {
    private lateinit var binding: ActivityNewsPolitics4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsPolitics4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}