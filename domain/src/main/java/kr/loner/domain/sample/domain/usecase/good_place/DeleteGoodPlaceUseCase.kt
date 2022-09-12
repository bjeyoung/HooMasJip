package kr.loner.domain.sample.domain.usecase.good_place

import kr.loner.domain.sample.domain.usecase.base.UseCase


class DeleteGoodPlaceUseCase : UseCase<DeleteGoodPlace, Boolean>() {
    override fun invoke(params: DeleteGoodPlace): Boolean {
        /**TODO: 파베에 데이터 업로드 하는 로직 추가 예정*/
        return true
    }

}

data class DeleteGoodPlace(
    val goodPlaceId: Long,
    val userId: Long,
)