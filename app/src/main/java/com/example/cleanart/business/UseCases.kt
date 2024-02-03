package com.example.cleanart.business

import android.util.Log
import com.example.cleanart.data.CategoryDataClass
import com.example.cleanart.data.RepoImp
import kotlinx.coroutines.flow.MutableStateFlow

class UseCases(val repoImp: RepoImp) {

    //for categories
    var datalist: MutableStateFlow<ArrayList<CategoryDataClass>> = repoImp.datalist


    suspend fun gettingCategory(callback: (Boolean) -> Unit) {
        Log.e("responseofapierror", "i am working")
        repoImp.gettingCategory(callback)
    }

    fun fetchAnimation(callback: (Boolean) -> Unit) {
        Log.e("responseofapierror", "i am working")
        //     return  repoImp.gettingCategory()
    }

    fun fetchTrendingAnimation(callback: (Boolean) -> Unit) {
        Log.e("responseofapierror", "i am working")
        //   return  repoImp.gettingCategory()
    }

    fun check() {
        repoImp.check()
    }

}