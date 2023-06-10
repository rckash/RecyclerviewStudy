package com.example.recyclerviewstudy

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewstudy.databinding.ItemLayoutBinding

class ItemViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Item) {
        binding.txtRecyclerviewName.text = item.name
        binding.txtRecyclerviewDescription.text = item.description
    }
}