package com.labactivity.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsPolitics2Binding

class newsPolitics2 : AppCompatActivity() {
    private lateinit var binding : ActivityNewsPolitics2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsPolitics2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}