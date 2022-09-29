package com.example.jysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Blog(
    val id: Long,
    val title: String = "",
    val content: String = "",
    val url: String = "",
    val imgUrl : String = "",
    val type : Int
)