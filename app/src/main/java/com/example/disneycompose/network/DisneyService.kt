package com.example.disneycompose.network



import com.example.disneycompose.model.Poster
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET

interface DisneyService {

    @GET("DisneyPosters2.json")
    suspend fun fetchDisneyPosterList(): ApiResponse<List<Poster>>
}