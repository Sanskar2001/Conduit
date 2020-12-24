package com.san22.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class user(
    @Json(name = "user")
    val user: UserX
)