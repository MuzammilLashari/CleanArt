package com.example.cleanart.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.cleanart.business.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BatteryViewModel @Inject constructor(val useCases: UseCases) :ViewModel() {
 fun gettingCategory(){
    var i=   useCases.gettingCategory()
      Log.e("mybatteryviewmodel" , i.toString())
    }

    fun fetchAnimation(){
       // useCases.postCategories()
        useCases.check()
    }
}