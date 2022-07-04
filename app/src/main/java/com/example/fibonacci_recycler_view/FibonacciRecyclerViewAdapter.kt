package com.example.fibonacci_recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciRecyclerViewAdapter (var numberList: List<Int>): RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
       var itemView = LayoutInflater.from(parent.context).inflate(R.layout.number_list_item, parent,false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumbers.text = numberList.get(position).toString()

    }

    override fun getItemCount(): Int {
     return numberList.size
    }
}

class NumberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}