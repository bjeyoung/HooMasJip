package kr.loner.domain.sample.domain.usecase.blog

import kr.loner.domain.sample.domain.Mock
import kr.loner.domain.sample.domain.usecase.base.UseCase
import kr.loner.domain.sample.model.BlogGroup
import kr.loner.domain.sample.model.Id

class GetFavoriteBlogGroupUseCase: UseCase<Id, BlogGroup>() {
    override fun invoke(params: Id) = BlogGroup(
        Mock.sampleBlogGroup.value.filter { it.userId == params.value }
    )
}