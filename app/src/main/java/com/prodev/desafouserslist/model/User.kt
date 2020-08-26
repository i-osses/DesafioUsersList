package com.prodev.desafouserslist.model

import com.google.gson.annotations.SerializedName


data class User (@SerializedName("id")val userId:Long, val name: String, val email: String, val phone:String)