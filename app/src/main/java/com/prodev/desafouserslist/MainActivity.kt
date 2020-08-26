package com.prodev.desafouserslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.prodev.desafouserslist.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var userAdapter: UserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = ArrayList<User>()
        users.add(User(1,"Jim","email@thedoors.com","12312312"))

        userAdapter =UserAdapter(users)
        recycler_view.adapter = userAdapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.addItemDecoration(
            DividerItemDecoration(
                this,
                LinearLayoutManager.VERTICAL
            )
        )

    }
}