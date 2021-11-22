package com.alisafarzadeh.kotlincode.model.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import kotlinx.parcelize.Parcelize


data class Blocks(
    @SerializedName("body")
    @Expose
    var body: List<Body>
)