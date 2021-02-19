package com.kanyideveloper.viewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kanyideveloper.viewbinding.databinding.RecylerRowBinding

class MyAdapter(list: ArrayList<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private val myList: ArrayList<String> = list

    class MyViewHolder(val binding: RecylerRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RecylerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.textView1.text = "Hello There"
        holder.binding.textView2.text = "I am Joel"
        holder.binding.textView3.text = "an Upcoming Android Dev"
    }

    override fun getItemCount(): Int {
        return myList.size
    }
}