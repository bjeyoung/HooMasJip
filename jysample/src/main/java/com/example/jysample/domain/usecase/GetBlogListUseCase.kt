package com.example.jysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GetBlogListUseCase(
    private val blogRepository: BlogRepository
) {
    suspend fun getBlogDataList(
        query: String,
        display: Int? = null,
        start: Int? = null,
        sort: String? = null
    ): List<Blog> {
        return blogRepository.run {
            emptyList<Blog>()
                .plus(getNaverBlogList(query))
                .plus(getDaumBlogList(query))
                .shuffled()
        }
    }
}