package com.example.newapp

import androidx.recyclerview.widget.RecyclerView
import com.example.newapp.databinding.NewsItemBinding

class NewsViewHolder(private val newsItemBinding: NewsItemBinding) : RecyclerView.ViewHolder(newsItemBinding.root) {

    fun bind(article : Articles) {
        newsItemBinding.title.text = article.title
        newsItemBinding.description.text = article.description
    }
}