package com.san22.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.jetbrains.annotations.Nullable

@JsonClass(generateAdapter = true)
data class Article(
    @Json(name = "article")
    val article: ArticlePojo
)