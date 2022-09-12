package kr.loner.domain.sample.domain.usecase.location

import kr.loner.domain.sample.domain.usecase.base.UseCase
import kr.loner.domain.sample.domain.usecase.blog.LatLns

class AddressTransferUseCase: UseCase<LatLns, String>() {
    override fun invoke(params: LatLns): String {
        //지오코드 api 사용 하여 params 를 스트링으로 변환 후 검색하기 아래는 변환된 객체
        return "ㅋㅋ"
    }

}

