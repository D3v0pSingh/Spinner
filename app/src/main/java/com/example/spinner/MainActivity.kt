package com.example.spinner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner1Btn.setOnClickListener {

            Intent(this,Spinner1::class.java).also{
                startActivity(it)
            }
        }
        
        spinner2Btn.setOnClickListener {
            Intent(this,Spinner2::class.java).also{
                startActivity(it)
            }
        }

        spinner3Btn.setOnClickListener {
            Intent(this,Spinner3::class.java).also{
                startActivity(it)
            }
        }
    }
}