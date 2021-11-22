package com.alisafarzadeh.kotlincode.model.model;

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Response(

    @SerializedName("status")
    @Expose
    val status: String ,
    @SerializedName("userTier")
    @Expose
    val userTier: String ,
    @SerializedName("total")
    @Expose
    val total: Integer ,
    @SerializedName("startIndex")
    @Expose
    val startIndex: Integer ,
    @SerializedName("pageSize")
    @Expose
    val pageSize: Integer ,
    @SerializedName("currentPage")
    @Expose
    val currentPage: Integer ,
    @SerializedName("pages")
    @Expose
    val pages: Integer ,
    @SerializedName("orderBy")
    @Expose
    val orderBy:  String ,
    @SerializedName("results")
    @Expose
    val results: List<Result>
)
