package com.example.cleanart.business

import android.util.Log
import com.example.cleanart.data.RepoImp
import com.example.cleanart.data.categories
import kotlinx.coroutines.flow.Flow

class UseCases(val repoImp: RepoImp) {
    fun gettingCategory(): Flow<List<categories>> {
        Log.e("responseofapierror", "i am working")
      return  repoImp.gettingCategory()
    }

    fun postCategories() {
        repoImp.fetchAnimation()
    }
    fun check() {
        repoImp.check()
    }

}