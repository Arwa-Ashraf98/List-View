package com.mad43.listviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NamesAdapter(val namesList : List<String>) : RecyclerView.Adapter<NamesAdapter.MyViewHolder>() {



    inner class MyViewHolder(val itemView: View) : ViewHolder(itemView) {
        val tvName : TextView = itemView.findViewById(R.id.tv_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.item_names_with_image , parent , false)
        return MyViewHolder(inflater)
    }

    override fun getItemCount(): Int {
       return namesList.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvName.text = namesList.get(position)
    }
}