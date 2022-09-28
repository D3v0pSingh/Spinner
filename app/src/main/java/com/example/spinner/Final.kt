package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class Final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val finalText = intent.getStringExtra("text")
        val finalText2 = intent.getStringExtra("data")

        textVew.apply {
            setText("Hello $finalText we are glad to have a citizen from $finalText2 as a team member")
        }
    }
}