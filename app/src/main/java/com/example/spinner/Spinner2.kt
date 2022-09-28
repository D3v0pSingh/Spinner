package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinner2.*

class Spinner2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner2)

        val list = listOf("First","Second","Third","Fourth")
        val adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,list)
//LHS onItemSelectedListener is function which contains AdapterView.OnItemSelectedListener as
        //a parameter and OnItemSelectedListener is a interface so to initialize an
        //interface we have to either make a seperate class or an anonymous class
        //we use AdapterView.OnItemSelectedListener in RHS to invoke item in adapter
        spinnerthesecond.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@Spinner2,"You have selected ${p0?.getItemAtPosition(p2)}",
                Toast.LENGTH_SHORT).show()
                //getItemAtPosition is a method of AdapterView
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        spinnerthesecond.adapter = adapter

    }
}