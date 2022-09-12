package kr.loner.domain.sample.domain.usecase.blog

import kr.loner.domain.sample.domain.usecase.base.UseCase

class ChangeIndexFavoriteBlogUseCase: UseCase<ChangeIndexFavoriteBlog, Boolean>() {
    override fun invoke(params: ChangeIndexFavoriteBlog): Boolean {
        /**TODO: 파베에 데이터 업로드 하는 로직 추가 예정*/
        return true
    }
}

data class ChangeIndexFavoriteBlog(
 val id:Long,
 val url:String,
 val prevPos:Int,
 val newPos:Int
)
