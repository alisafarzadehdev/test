package com.alisafarzadeh.kotlincode.repository

import android.util.Log
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map

class Repo(private val dataSource: DataSource = DataSource()) {

    fun getNameOfUsers() =  dataSource.getUsers()
            .map { list ->
                list.map {
                    it.response.results[0].webUrl
                }
            }.catch { error ->
                Log.e("Flow Error",error.message?:"Error")
            }

}