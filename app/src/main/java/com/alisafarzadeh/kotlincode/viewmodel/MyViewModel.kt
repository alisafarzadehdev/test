package com.alisafarzadeh.kotlincode.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alisafarzadeh.kotlincode.model.model.News
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import androidx.lifecycle.*
import com.alisafarzadeh.kotlincode.repository.DataSource
import kotlinx.coroutines.*

class MyViewModel : ViewModel() {

    val postDataLiveData : MutableLiveData<News> = MutableLiveData()

    fun getPost(apiKey: String?,type: String?,showBlocks: String?)
    {
        viewModelScope.launch {
            DataSource.getData(apiKey, type, showBlocks)
                .catch { e->
                    Log.d("main", "getPost: ${e.message}")
                }
                .collect {postData1->
                    postDataLiveData.value=postData1
                }
        }

    }
}