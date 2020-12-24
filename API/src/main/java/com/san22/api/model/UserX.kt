package com.san22.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserX(
    @Json(name = "bio")
    val bio: String,
    @Json(name = "email")
    val email: String,
    @Json(name = "image")
    val image: Any?,
    @Json(name = "token")
    val token: String,
    @Json(name = "username")
    val username: String
)