package com.umikhotimatus.acer.learnrecycleview.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.umikhotimatus.acer.learnrecycleview.R
import com.umikhotimatus.acer.learnrecycleview.model.Post
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.post_item_layout.view.*

class PostItemAdapter (val postList: List<Post>,val context: Context) :
    RecyclerView.Adapter<PostItemAdapter.viewHolder>() {
    class viewHolder (view: View): RecyclerView.ViewHolder(view){
        val tvTittle = view.tvTittle
        val tvBody= view.tvBody

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PostItemAdapter.viewHolder {
        return viewHolder(LayoutInflater.from(context).inflate(R.layout.post_item_layout,p0, false))
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(p0: viewHolder, p1: Int) {
        p0.tvTittle.text=postList.get(p1).title
    }

}