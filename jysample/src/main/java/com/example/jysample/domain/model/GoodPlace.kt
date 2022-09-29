package com.example.jysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class GoodPlace(
    val id: Long,
    val user : User,
    val lnt : Long,
    val lat : Long,
    val point : Int,
    val date : String,
    val memo : String,
    val address : String,
    val imgUrl : String,
    val call : String
)