package com.cespaul.recipes.data.model.api

import com.google.gson.annotations.SerializedName

data class RecipeList(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("images")
    val images: ArrayList<String>,
    @SerializedName("lastUpdated")
    val lastUpdated: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("instructions")
    val instructions: String,
    @SerializedName("difficulty")
    val difficulty: Int
)
