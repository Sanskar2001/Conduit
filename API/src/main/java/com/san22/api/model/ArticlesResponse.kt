package com.san22.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.jetbrains.annotations.Nullable

@JsonClass(generateAdapter = true)
data class ArticlesResponse(

    @Json(name = "articles")
    val articles:List<ArticlePojo>?,
    @Json(name = "articlesCount")
    val articlesCount: Int
)