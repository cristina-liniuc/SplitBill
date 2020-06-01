package com.example.splitbill

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListFriendViewHolder (inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.friends_list, parent, false)) {
        private var mFriendView: TextView? = null


        init {
            mFriendView = itemView.findViewById(R.id.friend)
        }

        fun bind(friend: Friend) {
            mFriendView?.text = friend.name
        }

    }
