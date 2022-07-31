package kr.loner.hoomasjip.util

import android.graphics.Color
import kr.loner.shared.HexColor

private fun String.toResColor(): Int =
    Color.parseColor(this)

fun HexColor.toResColor(): Int =
    this.value.toResColor()
