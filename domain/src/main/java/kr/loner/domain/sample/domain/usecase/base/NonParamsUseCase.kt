package kr.loner.domain.sample.domain.usecase.base

abstract class NonParamsUseCase<R> {
    abstract operator fun invoke():R
}