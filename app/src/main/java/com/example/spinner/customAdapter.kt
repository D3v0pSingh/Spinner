package com.example.spinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.spinner_content.view.*

class customAdapter(var con: Context, val arrayList: ArrayList<DataClass>):ArrayAdapter<DataClass>(
    con,R.layout.spinner_content,arrayList
) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layinflater : LayoutInflater = LayoutInflater.from(con)
        val view: View = layinflater.inflate(R.layout.spinner_content,null)

        val imageid = view.findViewById(R.id.img) as ImageView?
        val countryName =  view.findViewById(R.id.text) as TextView?

        imageid!!.setImageResource(arrayList[position].Image)
        countryName!!.text=arrayList[position].name

        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layinflater : LayoutInflater = LayoutInflater.from(con)
        val view: View = layinflater.inflate(R.layout.spinner_content,null)

        val imageid = view.findViewById(R.id.img) as ImageView
        val countryName =  view.findViewById(R.id.text) as TextView

        imageid.setImageResource(arrayList[position].Image)
        countryName.text=arrayList[position].name

        return view
    }
}