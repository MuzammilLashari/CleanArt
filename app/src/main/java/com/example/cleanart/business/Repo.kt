package com.example.cleanart.business

import com.example.cleanart.data.AnimationDataClass
import com.example.cleanart.data.CategoryDataClass
import com.example.cleanart.data.categories
import kotlinx.coroutines.flow.MutableStateFlow

interface Repo {

    //for Categories
    var datalist: MutableStateFlow<ArrayList<CategoryDataClass>>

    //for Animations
    var dataListAnimation: MutableStateFlow<ArrayList<AnimationDataClass>>

    suspend fun gettingCategory(callback: (Boolean) -> Unit)
    fun fetchAnimation()
    fun fetchTrendingAnimation()
    fun check()
}