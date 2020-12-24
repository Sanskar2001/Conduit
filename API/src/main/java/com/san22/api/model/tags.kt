package com.san22.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class tags(
    @Json(name = "tags")
    val tags: List<String>
)