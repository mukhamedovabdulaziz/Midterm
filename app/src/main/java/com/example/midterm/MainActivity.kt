package com.example.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tasks = ArrayList<Task>()
        for (i in 1..100) {
            tasks.add(Task("ID", "title" + i, "description", "status",
            "category", 10))
        }

        val taskListAdapter = TaskListAdapter(tasks, this)
        val layoutManager = LinearLayoutManager(this)
        recycle_view.layoutManager = layoutManager
        recycle_view.adapter = taskListAdapter

        //toast("${it.title} Clicked")
        button.setOnClickListener { }
    }



}