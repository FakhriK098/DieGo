package com.example.diego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment

class AboutMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        val nama: TextView = findViewById(R.id.tv_name)
        val email: TextView = findViewById(R.id.tv_email)

        nama.text = "Fakhri Khairi"
        email.text = "a3272940@bangkit.academy"
    }
}