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

class SecondFragment : Fragment() {

    private val dummyData = listOf(
        Friend("Friend1"),
        Friend("Friend2"),
        Friend("Friend3"),
        Friend("Friend4"),
        Friend("Friend5")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater !!. inflate (R.layout.fragment_second, container, false)
        val button: Button = view.findViewById(R.id.button_id)
        button.setOnClickListener { v: View -> buttonClicked(v)}

        val recyclerView: RecyclerView = view.findViewById(R.id.list_recycler_view)
        recyclerView.adapter = FriendAdapter(dummyData)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        return view
    }

    companion object {
        fun newInstance(): SecondFragment = SecondFragment()
    }

    private fun buttonClicked(view: View){}
}