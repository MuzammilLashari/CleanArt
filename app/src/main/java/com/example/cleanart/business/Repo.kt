package com.example.cleanart.business

import com.example.cleanart.data.categories
import kotlinx.coroutines.flow.Flow

interface Repo {
    fun gettingCategory()
   : Flow<List<categories>>
    fun fetchAnimation()
    fun check()
}