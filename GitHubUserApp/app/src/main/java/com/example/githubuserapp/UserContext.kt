package com.example.githubuserapp

import android.content.Context

class UserContext(val context: Context) {

    var names = context.resources.getStringArray(R.array.name)
    var followerss = context.resources.getStringArray(R.array.followers)
    var avatarr = context.resources.obtainTypedArray(R.array.avatar)
    val followingg = context.resources.getStringArray(R.array.following)
    val locationn = context.resources.getStringArray(R.array.location)
    val companyy = context.resources.getStringArray(R.array.company)
    val usernamee = context.resources.getStringArray(R.array.username)
    val listData: ArrayList<User>
        get() {
            val list = arrayListOf<User>()
            for (position in usernamee.indices) {
                val users = User().apply {
                    name = names[position]
                    followers = followerss[position]
                    avatar = avatarr.getResourceId(position, position)
                    location = locationn[position]
                    company = companyy[position]
                    following = followingg[position]
                    username = usernamee[position]
                }
                list.add(users)
            }
            return list
        }


}