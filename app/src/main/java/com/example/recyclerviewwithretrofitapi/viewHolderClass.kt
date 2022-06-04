package com.example.recyclerviewwithretrofitapi

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithretrofitapi.databinding.CardviewBinding

class viewHolderClass (private val binding: CardviewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(largeNews: model) {
        binding.largeNews = largeNews
    }
}