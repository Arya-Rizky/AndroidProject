package com.example.androidapp

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val checkbox : CheckBox = itemView.findViewById(R.id.checkbox1)
    val maintask : TextView = itemView.findViewById(R.id.text_main)
    val descripton : TextView = itemView.findViewById(R.id.text_sub)

}