package kr.loner.domain.sample.domain.usecase.blog

import kr.loner.domain.sample.domain.usecase.base.UseCase

class RegisterFavoriteBlogUseCase: UseCase<RegisterFavoriteBlog, Boolean>() {
    override fun invoke(params: RegisterFavoriteBlog): Boolean {
        /**TODO: 파베에 데이터 업로드 하는 로직 추가 예정*/
        return true
    }
}

data class RegisterFavoriteBlog(
    val userId:Long,
    val url:String
)