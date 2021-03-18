package com.example.githubuserapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class UserAdapter (private val listUser: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgAvatar: ImageView = itemView.findViewById(R.id.img_avatar)
        var txtUserName: TextView = itemView.findViewById(R.id.txt_username)
        var txtName: TextView = itemView.findViewById(R.id.txt_name)
        val itemLayout: RelativeLayout = itemView.findViewById(R.id.item_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.item_user,
            parent,
            false
        )
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = listUser[position]
        holder.imgAvatar.setImageResource(user.avatar)
        holder.txtUserName.text = user.username
        holder.txtName.text = user.name
        holder.itemLayout.setOnClickListener {
            val intent: Intent = Intent(holder.imgAvatar.context, UserDetailActivity::class.java)
            intent.putExtra("user", user)
            holder.imgAvatar.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

}


