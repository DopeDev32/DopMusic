package com.example.dopmusic

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @Headers("x-rapidapi-key:0c0d552e01mshe66383169f15c5bp109d12jsne3dae4e46c3b", "x-rapidapi-host:deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query : String) : Call<myData>
}