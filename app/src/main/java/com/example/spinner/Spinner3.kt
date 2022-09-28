package com.example.spinner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinner3.*

class Spinner3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner3)

        val piclist = arrayOf<Int>(R.drawable.afghanistan,R.drawable.argentina,R.drawable.canada,
            R.drawable.germany,R.drawable.india,R.drawable.ireland,
            R.drawable.norway,R.drawable.sweden,R.drawable.usa)

        val nameList = arrayOf<String>("Afghanistan","Argentina","Canada","Germany","India","Ireland","Norway","Sweden","United States Of America")

        val customArraylist =ArrayList<DataClass>()

        for(i in piclist.indices){
            val items = DataClass(nameList[i],piclist[i])
            customArraylist.add(items)
        }

        spinnerthethird.adapter =customAdapter(this,customArraylist)
        spinnerthethird.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(
                    this@Spinner3, "You belong to ${nameList[p2]} Fucker.",
                    Toast.LENGTH_SHORT
                ).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        donebtn.setOnClickListener {
            val data:String = spinnerthethird.selectedItem.toString()
            Intent(this,Final::class.java).also {
                val text = editText.text.toString()
                it.putExtra("text",text)
                it.putExtra("data",data)
                startActivity(it)
            }
        }
    }
}

