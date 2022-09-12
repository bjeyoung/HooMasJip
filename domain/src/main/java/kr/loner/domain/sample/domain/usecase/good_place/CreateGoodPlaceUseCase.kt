package kr.loner.domain.sample.domain.usecase.good_place

import kr.loner.domain.sample.domain.usecase.base.UseCase
import kr.loner.domain.sample.model.GoodPlace

class CreateGoodPlaceUseCase: UseCase<GoodPlace, Boolean>() {
    override fun invoke(params: GoodPlace): Boolean {
        /**TODO: 파베에 데이터 업로드 하는 로직 추가 예정*/
        return true
    }

}