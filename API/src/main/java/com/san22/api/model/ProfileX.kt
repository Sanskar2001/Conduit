package com.san22.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProfileX(
    @Json(name = "bio")
    val bio: String,
    @Json(name = "following")
    val following: Boolean,
    @Json(name = "image")
    val image: String,
    @Json(name = "username")
    val username: String
)