package com.example.cleanart

import android.view.animation.Animation
import com.example.cleanart.data.AnimationDataClass
import com.example.cleanart.data.CategoryDataClass
import com.example.cleanart.data.categories
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiClient {

    /*@POST("/create-category/")
    fun postCategories(@Header("Authorization") token: String): Call<DataClass>*/

    @GET("/Categories")
    fun fetchCategories(@Header("Authorization") token: String): Call<CategoryDataClass>

    /*@POST("/create_animation/")
    fun postAnimation(@Header("Authorization")token: String):Call<DataClass>*/

    @GET("/Animations")
    fun fetchAnimation(@Header("Authorization")token: String):Call<AnimationDataClass>

    /*@POST("/Animations_category_ID")
    fun postAnimationCat(@Header("Authorization")token: String):Call<DataClass>*/

    @GET("/Trending_Animations")
    fun fetchTrendingAnimation(@Header("Authorization")token: String):Call<CategoryDataClass>


}