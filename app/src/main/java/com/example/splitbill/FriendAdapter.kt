package com.example.splitbill

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FriendAdapter(private val list: List<Friend>) : RecyclerView.Adapter<ListFriendViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFriendViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ListFriendViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ListFriendViewHolder, position: Int) {
        val friend: Friend = list[position]
        holder.bind(friend)
    }

    override fun getItemCount(): Int = list.size

}