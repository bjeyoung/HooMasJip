package kr.loner.domain.sample.model

data class Blog(
    val id: Long,
    val title: String = "ㅋㅋ",
    val content: String = "ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㅇㅁㄴㅇㅁ",
    val url: String = "https://gift123.tistory.com/",
    val userId: Long? = 0
)
