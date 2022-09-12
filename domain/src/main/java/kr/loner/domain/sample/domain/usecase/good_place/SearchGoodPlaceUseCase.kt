package kr.loner.domain.sample.domain.usecase.good_place

import kr.loner.domain.sample.domain.Mock
import kr.loner.domain.sample.domain.usecase.base.UseCase
import kr.loner.domain.sample.model.GoodPlaceGroup

class SearchGoodPlaceUseCase: UseCase<String, GoodPlaceGroup>() {
    override fun invoke(params: String) = GoodPlaceGroup(
        Mock.sampleGoodPlaceGroup.value.filter { it.name == params  }
    )
}