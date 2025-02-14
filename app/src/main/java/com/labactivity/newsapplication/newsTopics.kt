package com.labactivity.newsapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.newsapplication.databinding.ActivityNewsTopicsBinding

class newsTopics : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private lateinit var binding: ActivityNewsTopicsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsTopicsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPolitics.setOnClickListener {
            val tpPolitic = Intent(this, politics::class.java)
            startActivity(tpPolitic)
        }

        binding.btnLifestyle.setOnClickListener {
            val tpLifestyle = Intent(this, lifestyle::class.java)
            startActivity(tpLifestyle)
        }

        binding.btnSports.setOnClickListener {
            val tpSports = Intent(this, sports::class.java)
            startActivity(tpSports)
        }

        val adapter = ArrayAdapter.createFromResource(this, R.array.menu_dropdown, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = adapter
        binding.spinner.onItemSelectedListener = this

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        val text:String = p0?.getItemAtPosition(p2).toString()
        Toast.makeText(p0?.context, text, Toast.LENGTH_SHORT).show()

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

        }

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
    }
}