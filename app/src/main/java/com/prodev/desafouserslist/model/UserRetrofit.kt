package com.prodev.desafouserslist.model

import retrofit2.Retrofit

class UserRetrofit {


        companion object {
            private const val BASE_URL = "https://jsonplaceholder.typicode.com"
            fun retrofitInstance(): UserApi {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .build()
                return retrofit.create(UserApi::class.java)
            }
        }

}