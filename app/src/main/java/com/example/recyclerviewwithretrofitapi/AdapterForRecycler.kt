package com.example.recyclerviewwithretrofitapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithretrofitapi.databinding.CardviewBinding

class AdapterForRecycler(private val largeNewsList: List<model>) : RecyclerView.Adapter<viewHolderClass>() {
    private lateinit var binding: CardviewBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolderClass {
    binding = CardviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return viewHolderClass(binding)
        }

    override fun onBindViewHolder(holder: viewHolderClass, position: Int) {
        val largeNews= largeNewsList[position]
        holder.bind(largeNews)
    }

    override fun getItemCount(): Int =largeNewsList.size
}