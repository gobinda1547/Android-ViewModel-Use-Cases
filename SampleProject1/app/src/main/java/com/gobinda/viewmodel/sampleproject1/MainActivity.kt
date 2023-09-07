package com.gobinda.viewmodel.sampleproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener { handleButton1Clicked() }
        findViewById<Button>(R.id.button2).setOnClickListener { handleButton2Clicked() }
    }

    private fun handleButton1Clicked() {
        startActivity(Intent(this, MainActivity1::class.java))
        finish()
    }

    private fun handleButton2Clicked() {
        startActivity(Intent(this, MainActivity2::class.java))
        finish()
    }
}