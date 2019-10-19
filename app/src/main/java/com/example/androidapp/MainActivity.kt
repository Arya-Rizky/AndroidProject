package com.example.androidapp

import android.graphics.drawable.ClipDrawable.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler_view = findViewById<RecyclerView>(R.id.reyclerview)


        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recycler_view.adapter = RecyclerAdapter(this, listOf(
            task("do chores", ""),
            task("do chores", "clean clothes"),
            task("do chores", ""),
            task("do chores", "go there"),
            task("do chores", ""),
            task("do chores", ""),
            task("do chores", ""),
            task("do chores", ""),
            task("do chores", ""),
            task("do chores", "")
        ))


    }
}
