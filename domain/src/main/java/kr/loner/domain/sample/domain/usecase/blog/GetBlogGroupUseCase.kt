package kr.loner.domain.sample.domain.usecase.blog

import kr.loner.domain.sample.domain.Mock
import kr.loner.domain.sample.domain.usecase.base.UseCase
import kr.loner.domain.sample.model.BlogGroup

//네이버 블로그 api, 다음 블로그 api 는 레포지토리에서 변환후 도메인에서 받으면 될듯.
class GetBlogGroupUseCase : UseCase<LatLns, BlogGroup>() {
    override fun invoke(params: LatLns): BlogGroup {
        //지오코드 api 사용 하여 params 를 스트링으로 변환 후 검색하기 아래는 변환된 객체
        val searchAddress = "ㅋㅋ"
        return BlogGroup(Mock.sampleBlogGroup.value.filter { it.title == searchAddress })
    }
}

data class LatLns(val lats: Double, val long: Double)