package com.san22.api

import com.san22.api.services.myApi
import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object  Client{
    val retrofit=Retrofit.Builder().baseUrl("https://conduit.productionready.io/api/").addConverterFactory(MoshiConverterFactory.create()).build();
    public  val api=retrofit.create(myApi::class.java);
}