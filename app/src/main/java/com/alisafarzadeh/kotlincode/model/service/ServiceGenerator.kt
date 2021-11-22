package com.alisafarzadeh.kotlincode.model.service

import retrofit2.Retrofit
import com.alisafarzadeh.kotlincode.model.service.ServiceGenerator
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Service generator so that only one web socket is opened throughout the application
 */
object ServiceGenerator {
    private const val BASE_URL = "https://content.guardianapis.com/"
    var myService: Retrofit? = null

    fun getservice():Retrofit {
        if (myService == null) {
            myService = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return myService!!
    }
}