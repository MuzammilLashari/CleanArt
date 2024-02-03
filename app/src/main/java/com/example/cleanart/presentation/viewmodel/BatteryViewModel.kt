package com.example.cleanart.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanart.business.UseCases
import com.example.cleanart.data.AnimationDataClass
import com.example.cleanart.data.CategoryDataClass
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BatteryViewModel @Inject constructor(val useCases: UseCases) : ViewModel() {

    //for Categories
    private var datalist: MutableStateFlow<ArrayList<CategoryDataClass>> = useCases.datalist

    //for Categories
    private var animationDataList: MutableStateFlow<ArrayList<AnimationDataClass>> = useCases.animationDataList

    fun gettingCategory() {
        viewModelScope.launch {
            useCases.gettingCategory() {
                if (it) {
                    Log.i("ApiChecking", "gettingCategory: ${datalist.value}")
                }

            }
        }
        //  Log.e("mybatteryviewmodel" , i.toString())
    }

    fun fetchAnimation() {

        viewModelScope.launch {
            useCases.fetchAnimation() {
                if (it) {
                    Log.i("ApiChecking", "gettingCategory: ${animationDataList.value}")
                }

            }
        }

    }

    fun fetchTrendingAnimation() {
        // useCases.postCategories()
        useCases.check()
    }
}