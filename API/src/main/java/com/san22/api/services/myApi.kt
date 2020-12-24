package com.san22.api.services

import com.san22.api.model.ArticlesResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface myApi {
@GET("articles")
suspend fun  fetchArticles():Response<ArticlesResponse>

}