package com.cespaul.recipes.data.model.api

import com.google.gson.annotations.SerializedName

data class Recipe(
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
    val difficulty: Int,
    @SerializedName("similar")
    val similar: ArrayList<RecipeBrief>
)
