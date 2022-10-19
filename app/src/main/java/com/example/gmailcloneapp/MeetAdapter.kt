package com.example.gmailcloneapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailcloneapp.databinding.MeetItemBinding

class MeetAdapter : ListAdapter<MeetItem, MeetAdapter.MeetViewHolder>(MeetItem.COMPARATOR) {
    class MeetViewHolder(val binding: MeetItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: MeetItem) = binding.apply {
            this.button
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):MeetViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MeetItemBinding.inflate(inflater, parent, false)
        return MeetViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MeetViewHolder, position: Int){
        val item = currentList.get(position)
        holder.bind(item)
    }

}