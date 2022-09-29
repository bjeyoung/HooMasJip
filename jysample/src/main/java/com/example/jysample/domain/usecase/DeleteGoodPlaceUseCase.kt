package com.example.jysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DeleteGoodPlaceUseCase : UseCase<GoodPlace, Boolean>() {
    override fun invoke(params: GoodPlace): Boolean {
        return true
    }