package com.example.gmailcloneapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailcloneapp.databinding.MailsItemBinding
import java.lang.reflect.Type


class MailsAdapter : ListAdapter<MailsItem,MailsAdapter.MailsViewHolder>(MailsItem.COMPARATOR){
   // Inherits from ViewHolder class
    class MailsViewHolder(val binding:MailsItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: MailsItem ) = binding.apply{
            this.imageView
            this.textView1.text = item.text1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MailsItemBinding.inflate(inflater,parent,false)
        return MailsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MailsViewHolder, position: Int) {
        val item = currentList.get(position)
        holder.bind(item)
    }


}