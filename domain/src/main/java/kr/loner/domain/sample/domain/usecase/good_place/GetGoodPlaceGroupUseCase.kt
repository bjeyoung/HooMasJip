package kr.loner.domain.sample.domain.usecase.good_place

import kr.loner.domain.sample.domain.Mock
import kr.loner.domain.sample.domain.usecase.base.UseCase
import kr.loner.domain.sample.model.GoodPlaceGroup
import kr.loner.domain.sample.model.Id

class GetGoodPlaceGroupUseCase : UseCase<Id, GoodPlaceGroup>() {
    override fun invoke(params: Id): GoodPlaceGroup = GoodPlaceGroup(
        Mock.sampleGoodPlaceGroup.value.filter {
            it.userId == params.value
        }
    )
}