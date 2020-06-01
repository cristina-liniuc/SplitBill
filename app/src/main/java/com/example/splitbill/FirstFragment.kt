package com.example.splitbill

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater !!. inflate (R.layout.fragment_first, container, false)
        val button: Button = view.findViewById(R.id.button_id)
        button.setOnClickListener { v: View -> buttonClicked(v)
        }
        val recyclerView: RecyclerView = view.findViewById(R.id.list)
        val dummyData = generateDummyData(8)
        recyclerView.adapter = GroupAdapter(dummyData)
        recyclerView.layoutManager = GridLayoutManager(activity,2)
        return view

    }

    private fun buttonClicked(view: View){}

    private fun generateDummyData(size: Int) :List<GroupItem> {
        val list = ArrayList<GroupItem>()
        for (i in 1 until size+1) {
            val item = GroupItem("Group $i")
            list += item
        }
        return list
    }

}