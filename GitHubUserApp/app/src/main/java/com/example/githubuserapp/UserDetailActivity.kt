package com.example.githubuserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class UserDetailActivity : AppCompatActivity() {

    class DetailActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_user_detail)
            val imgAvatar: ImageView = findViewById(R.id.img_avatar_detail)
            val txtUserName: TextView = findViewById(R.id.txt_username_detail)
            val txtName: TextView = findViewById(R.id.txt_name_detail)
            val txtLocation: TextView = findViewById(R.id.txt_location_detail)
            val txtCompany: TextView = findViewById(R.id.txt_company_detail)
            val txtFollowers: TextView = findViewById(R.id.txt_followers_detail)
            val txtFollowing: TextView = findViewById(R.id.txt_following_detail)
            val txtRepository: TextView = findViewById(R.id.txt_repository_detail)
            intent.getParcelableExtra<User>("user")?.apply {
                imgAvatar.setImageResource(avatar)
                txtUserName.text = username
                txtName.text = name
                txtLocation.text = location
                txtCompany.text = company
                txtFollowers.text = followers
                txtFollowing.text = following
                txtRepository.text = repository
            }
        }
    }

}

