package com.example.cleanart

import android.provider.ContactsContract.Data
import com.example.cleanart.data.DataClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiClient {

    @POST("/create-category/")
    fun postCategories(@Header("Authorization") token: String): Call<DataClass>

    @GET("/Categories")
    fun fetchCategories(@Header("Authorization") token: String): Call<DataClass>

    @POST("/create_animation/")
    fun postAnimation(@Header("Authorization")token: String):Call<DataClass>

    @GET("/Animations")
    fun fetchAnimation(@Header("Authorization")token: String):Call<DataClass>

    @POST("/Animations_category_ID")
    fun postAnimationCat(@Header("Authorization")token: String):Call<DataClass>

    @GET("/Trending_Animations")
    fun fetchTrendingAnimation(@Header("Authorization")token: String):Class<DataClass>


}