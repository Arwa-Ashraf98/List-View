package com.mad43.listviewexample

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var nameRecyclerView : RecyclerView
    private lateinit var names : ArrayList<String>
    private lateinit var adapter : NamesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameRecyclerView = findViewById(R.id.rv_names)

        names = arrayListOf("arwa" , "mohamed" , "dina" , "sayed" , "abdullah" , "ahmed" , "manar" , "yasmean" , "youssef")

        adapter = NamesAdapter(names)

        nameRecyclerView.adapter = adapter




    }
}