package com.san22.conduit.data
import com.san22.api.Client
import com.san22.api.services.myApi
object ArticlesRepo {

    val api=Client.api;
    suspend fun getGlobalFeed() = api.fetchArticles().body()?.articles;
}