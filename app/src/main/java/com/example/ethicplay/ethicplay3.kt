package com.example.ethicplay

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ethicplay3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ethicplay3)
        val create=findViewById<TextView>(R.id.create)

        create.setOnClickListener {
            intent= Intent(applicationContext,ethicplay2::class.java)
            startActivity(intent)
        }

    }
}