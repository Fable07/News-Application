package com.labactivity.newsapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivitySportsBinding

class sports : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private lateinit var binding: ActivitySportsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySportsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSports1.setOnClickListener {
            val content1 = Intent(this, newsSports1::class.java)
            startActivity(content1)
        }

        binding.btnSports2.setOnClickListener {
            val content2 = Intent(this, newsSports2::class.java)
            startActivity(content2)
        }

        binding.btnSports3.setOnClickListener {
            val content3 = Intent(this, newsSports3::class.java)
            startActivity(content3)
        }

        binding.btnSports4.setOnClickListener {
            val content4 = Intent(this, newsSports4::class.java)
            startActivity(content4)
        }

        val adapter = ArrayAdapter.createFromResource(this, R.array.menu_polDown, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner4.adapter = adapter
        binding.spinner4.onItemSelectedListener = this

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text:String = parent?.getItemAtPosition(position).toString()
        Toast.makeText(parent?.context, text, Toast.LENGTH_SHORT).show()

        if (text == "Logout") {
            val logout = Intent(this, MainActivity::class.java)
            startActivity(logout)

        } else if (text == "About us") {
            val about = Intent(this, aboutus::class.java)
            startActivity(about)

        } else if (text == "FAQ's") {
            val faqs = Intent(this, FAQs::class.java)
            startActivity(faqs)

        } else if (text == "Settings") {
            val setting = Intent(this, settings::class.java)
            startActivity(setting)

        } else if (text == "Account") {
            val account = Intent(this, account::class.java)
            startActivity(account)

        } else if (text == "Home") {
            val home = Intent(this, newsTopics::class.java)
            startActivity(home)
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}