package com.example.gmailcloneapp

import androidx.recyclerview.widget.DiffUtil

data class MailsItem (val imageResource: Int, val text1:String){
    companion object {
        val COMPARATOR  = object : DiffUtil.ItemCallback<MailsItem>(){
            override fun areItemsTheSame(oldItem: MailsItem, newItem: MailsItem): Boolean {
                return  oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: MailsItem, newItem: MailsItem): Boolean {
                return oldItem == newItem
            }

        }
    }
}