package com.example.jysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GetGoodPlaceUseCase(val goodPlaceRepository: GoodPlaceRepository) {
    suspend fun getGoodPlaceList(
        query: String
    ) : List<GoodPlace> {
        return goodPlaceRepository.run{
            emptyList<GoodPlace>()
                .plus(getGoodPlaceList(query))
        }
    }
}