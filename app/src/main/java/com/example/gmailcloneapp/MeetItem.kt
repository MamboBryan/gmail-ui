package com.example.gmailcloneapp

import androidx.recyclerview.widget.DiffUtil

data class MeetItem (val text1 : String) {
    companion object{
        val COMPARATOR = object : DiffUtil.ItemCallback<MeetItem>(){
            override fun areItemsTheSame(oldItem: MeetItem, newItem: MeetItem): Boolean {
                return  oldItem == newItem
            }
            override fun areContentsTheSame(oldItem: MeetItem, newItem: MeetItem): Boolean {
                return oldItem == newItem
            }

        }
    }
}