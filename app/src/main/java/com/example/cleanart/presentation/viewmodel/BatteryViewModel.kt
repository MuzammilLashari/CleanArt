package com.example.cleanart.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cleanart.business.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BatteryViewModel @Inject constructor(val useCases: UseCases) :ViewModel() {
    fun gettingCategory(){
        useCases.gettingCategory()
    }

    fun postCategories(){
        useCases.postCategories()
    }
}