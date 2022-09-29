package com.example.apisample.domain.repository

import com.example.apisample.shared.blog.Blog

interface GoodPlaceRepository {

    suspend fun getGoodPlace(
        query: String,
    ): List<GoodPlace>
}