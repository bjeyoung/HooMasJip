package kr.loner.domain.sample.domain

import kr.loner.domain.sample.model.Blog
import kr.loner.domain.sample.model.BlogGroup
import kr.loner.domain.sample.model.GoodPlace
import kr.loner.domain.sample.model.GoodPlaceGroup

object Mock {
    val sampleGoodPlaceGroup = GoodPlaceGroup(
        listOf(
            GoodPlace(0),
            GoodPlace(1),
            GoodPlace(2),
            GoodPlace(3),
            GoodPlace(4),
            GoodPlace(5)
        )
    )

    val sampleBlogGroup = BlogGroup(
        listOf(
            Blog(0),
            Blog(1),
            Blog(2),
            Blog(3),
            Blog(4),
            Blog(5),
        )
    )
}