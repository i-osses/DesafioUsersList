package com.prodev.desafouserslist.model

import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi    {
    @GET("/users")
    fun getAllPosts(): Call<ArrayList<User>>

    @GET("/users")
    fun groupList(): Call<List<User>>

    @DELETE("/posts/{userId}")
    fun deletePost(@Path("userId") userId: Int?): Call<Void>
}