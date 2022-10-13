package com.example.dogapi.models

import com.google.gson.annotations.SerializedName

data class DogBreed(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)
