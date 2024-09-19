package com.example.ethicplay

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ethicplay4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ethicplay4)

        val et4card=findViewById<CardView>(R.id.et4card)

        et4card.setOnClickListener{
            intent=Intent(applicationContext,ethicplay5::class.java)
            startActivity(intent)
        }

    }
}