package com.example.dogapi

import com.example.dogapi.models.DogBreed
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    @GET
    suspend fun getDogsByBreeds(@Url url: String): Response<DogBreed>
}