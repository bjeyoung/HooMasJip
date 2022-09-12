package kr.loner.domain.sample.domain.usecase.base

abstract class UseCase<T,R> {
    abstract operator fun invoke(params:T):R
}