package com.cespaul.recipes.data.model.api

import com.google.gson.annotations.SerializedName

data class RecipeBrief(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("name")
    val name: String
)
