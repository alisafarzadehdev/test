package com.alisafarzadeh.kotlincode.repository

import android.content.Intent
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import com.alisafarzadeh.kotlincode.CatalogActivity
import com.alisafarzadeh.kotlincode.NewsAdapter
import com.alisafarzadeh.kotlincode.R
import com.alisafarzadeh.kotlincode.ShowNewsActivity
import com.alisafarzadeh.kotlincode.model.model.News
import com.alisafarzadeh.kotlincode.model.service.NewsClient
import com.alisafarzadeh.kotlincode.model.service.ServiceGenerator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class DataSource {

    companion object {

        val news:NewsClient = ServiceGenerator.getservice().create(NewsClient::class.java)
        val client = ServiceGenerator.getservice().create(NewsClient::class.java)
        fun getData(apiKey: String?,type: String?,showBlocks: String?):Flow<News> = flow {
            val response = client.getBaseJson(apiKey,type,showBlocks)
            emit(response)
        }.flowOn(Dispatchers.IO)

    }

    fun getUsers(): Flow<List<News>> = flow {
        // fake data
        emit(call!!)
        delay(3000)
    }

    val client = ServiceGenerator.getservice().create(NewsClient::class.java)
    val call:List<News>? =null

    private suspend fun makeBaseNetworkCall() {
        val call = client.getBaseJson(
            CatalogActivity.API_KEY,
            CatalogActivity.API_REQUEST_TYPE,
            CatalogActivity.API_BLOCK_TYPE
        )
    }
}