package com.prodev.desafouserslist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prodev.desafouserslist.model.User
import kotlinx.android.synthetic.main.user_item.view.*

class UserAdapter(private val users: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false)
        return (UserViewHolder(view))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemView.name_item.text = users[position].name
        holder.itemView.email_item.text = users[position].email
        holder.itemView.id_item.text = users[position].userId.toString()
    }

    override fun getItemCount(): Int {
        return users.size
    }


}