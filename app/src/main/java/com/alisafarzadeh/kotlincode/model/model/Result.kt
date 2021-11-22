package com.alisafarzadeh.kotlincode.model.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import kotlinx.parcelize.Parcelize

data class Result (
    @SerializedName("id")
    @Expose
    var id : String,
    @SerializedName("type")
    @Expose
    var type: String,
    @SerializedName("sectionId")
    @Expose
    val sectionId: String,
    @SerializedName("sectionName")
    @Expose
    val sectionName: String ,
    @SerializedName("webPublicationDate")
    @Expose
    val webPublicationDate: String,
    @SerializedName("webTitle")
    @Expose
    val webTitle: String,
    @SerializedName("webUrl")
    @Expose
    val webUrl: String,
    @SerializedName("apiUrl")
    @Expose
    val apiUrl: String,
    @SerializedName("blocks")
    @Expose
    val blocks: Blocks ,
    @SerializedName("isHosted")
    @Expose
    val isHosted: Boolean,
    @SerializedName("pillarId")
    @Expose
    val pillarId: String,
    @SerializedName("pillarName")
    @Expose
    val pillarName: String
)