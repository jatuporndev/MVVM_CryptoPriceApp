package com.example.coinsmvvm.model.Coin


import com.google.gson.annotations.SerializedName

data class Link(
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)