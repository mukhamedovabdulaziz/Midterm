package com.example.midterm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskListAdapter(private val tasks:ArrayList<Task>, private val context: Context):
    RecyclerView.Adapter<TaskListAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val task = tasks[position]
        holder.titleText.text = task.title
        holder.statusText.text = task.status
        holder.categoryText.text = task.category

    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var titleText: TextView = view.findViewById(R.id.title)
        var statusText: TextView = view.findViewById(R.id.status)
        var categoryText: TextView = view.findViewById(R.id.category)
    }
}