package com.alisafarzadeh.kotlincode.repository

import com.alisafarzadeh.kotlincode.model.model.News
import com.alisafarzadeh.kotlincode.model.service.NewsClient
import com.alisafarzadeh.kotlincode.model.service.ServiceGenerator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class FlowRepository  (private val api: NewsClient) {

    /*
    fun getFoo(apiKey: String?,type: String?,showBlocks: String?): Flow<News> {
        return flow {
            // exectute API call and map to UI object
            val fooList = api.getBaseJson(apiKey,type,showBlocks).map{ fooFromApi ->
                    NewsUI.getui(fooFromApi)
                }

            // Emit the list to the stream
            emit(fooList)
        }.flowOn(Dispatchers.IO) // Use the IO thread for this Flow
    }

    suspend fun getFooAlternative(apiKey: String?, type: String?, showBlocks: String?): Flow<News> {
        return api.getBaseJson(apiKey,type,showBlocks)
            .map { fooFromApi -> NewsUI.getui(fooFromApi)}
            .asFlow()
            .flowOn(Dispatchers.IO)
    }

     */
}