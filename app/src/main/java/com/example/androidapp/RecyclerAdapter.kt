package com.example.androidapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (var context: Context, var list: List<task>) : RecyclerView.Adapter<RecyclerAdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterViewHolder {
        val viewedItem : View = LayoutInflater.from(context).inflate(R.layout.itemlist, parent, false)

        return RecyclerAdapterViewHolder(viewedItem)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapterViewHolder, position: Int) {
        holder.maintask.text =list[position].maintask
        if (list[position].description == ""){
            holder.descripton.visibility = View.GONE
        }else{
            holder.descripton.text = list[position].description
        }

    }
}