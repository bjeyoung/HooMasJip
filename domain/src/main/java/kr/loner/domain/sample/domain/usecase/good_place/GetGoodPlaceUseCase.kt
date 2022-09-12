package kr.loner.domain.sample.domain.usecase.good_place

import kr.loner.domain.sample.domain.Mock
import kr.loner.domain.sample.domain.usecase.base.UseCase
import kr.loner.domain.sample.model.GoodPlace
import kr.loner.domain.sample.model.Id

class GetGoodPlaceUseCase: UseCase<Id, GoodPlace>() {
    override fun invoke(params: Id): GoodPlace = Mock.sampleGoodPlaceGroup.value.first()
}