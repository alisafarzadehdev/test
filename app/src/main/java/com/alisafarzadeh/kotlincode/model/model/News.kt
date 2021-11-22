package com.alisafarzadeh.kotlincode.model.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.alisafarzadeh.kotlincode.model.model.News
import kotlinx.parcelize.Parcelize

class News (
    @SerializedName("response")
    @Expose
    var response: Response
)