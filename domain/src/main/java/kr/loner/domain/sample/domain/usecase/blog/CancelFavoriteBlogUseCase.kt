package kr.loner.domain.sample.domain.usecase.blog

import kr.loner.domain.sample.domain.usecase.base.UseCase

class CancelFavoriteBlogUseCase: UseCase<CancelFavoriteBlog, Boolean>() {
    override fun invoke(params: CancelFavoriteBlog): Boolean {
        /**TODO: 파베에 데이터 업로드 하는 로직 추가 예정*/
        return true
    }
}

data class CancelFavoriteBlog(
    val userId:Long,
    val url:String
)