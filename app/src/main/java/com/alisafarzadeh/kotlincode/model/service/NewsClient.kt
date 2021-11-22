package com.alisafarzadeh.kotlincode.model.service

import retrofit2.http.GET
import com.alisafarzadeh.kotlincode.model.model.News
import retrofit2.Call
import retrofit2.http.Query

interface NewsClient {
    @GET("search")
    fun getBaseJson( // API key should always be constant
        @Query("api-key") apiKey: String?,  // Type should always be "Article" for the purpose of this demo
        @Query("type") type: String?,  // Show-blocks should always be "Body" to get the main text of an article
        @Query("show-blocks") showBlocks: String?
    ): Call<News>
}