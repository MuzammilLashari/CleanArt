package com.example.cleanart

import com.example.cleanart.data.DataClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiClient {

    @GET("/Categories")
    fun fetchCategories(@Header("Authorization") token: String): Call<DataClass>
}