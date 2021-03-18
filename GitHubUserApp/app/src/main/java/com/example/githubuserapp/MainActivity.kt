package com.example.githubuserapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvLayout: RecyclerView
    private var list: ArrayList<User> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvLayout = findViewById(R.id.lv_list)
        rvLayout.setHasFixedSize(true)

        val userContext = UserContext(context = applicationContext)
        list.addAll(userContext.listData)
        showRecyclerList()


    }


    private fun showRecyclerList() {
        rvLayout.layoutManager = LinearLayoutManager(this)
        val UserAdapter = UserAdapter(list)
        rvLayout.adapter = UserAdapter


    }
}
