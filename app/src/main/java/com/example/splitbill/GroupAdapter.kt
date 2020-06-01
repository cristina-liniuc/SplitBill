package com.example.splitbill

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.group_list.view.*

class GroupAdapter(private val groupList: List<GroupItem>): RecyclerView.Adapter<GroupAdapter.GroupViewHolder>() {

    class GroupViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.group
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.group_list, parent, false)
        return GroupViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val currentItem = groupList[position]

        holder.textView.text=currentItem.name
    }

    override fun getItemCount() = groupList.size

}