package com.example.jysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class User(
    val id: Long,
    val name: String,
    val myGoodPlaces: List<GoodPlace>,
    val wishList: List<Blog>,
    val type: Int
)