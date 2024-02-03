package com.example.cleanart.data

import android.util.Log
import com.example.cleanart.ApiClient
import com.example.cleanart.business.Repo
import kotlinx.coroutines.flow.MutableStateFlow
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoImp(private val apiClient: ApiClient) : Repo {
    val Token = "token 10d3129ad0dae85fe360e01faa83fa7971e47c40"

    //following Lists for Getting Category
    private var tempList: ArrayList<CategoryDataClass> = ArrayList(emptyList())
    private var _dataList = MutableStateFlow<ArrayList<CategoryDataClass>>(ArrayList())
    override var datalist: MutableStateFlow<ArrayList<CategoryDataClass>> = _dataList

    //following Lists for
    private var tempListAnimation: ArrayList<AnimationDataClass> = ArrayList(emptyList())
    private var dataListAnimation = MutableStateFlow<ArrayList<AnimationDataClass>>(ArrayList())
    override var datalistAnimation: MutableStateFlow<ArrayList<AnimationDataClass>> = dataListAnimation

    override suspend fun gettingCategory(callback: (Boolean) -> Unit) {
        apiClient.fetchCategories(Token).enqueue(object : Callback<CategoryDataClass> {
            override fun onResponse(
                call: Call<CategoryDataClass>,
                response: Response<CategoryDataClass>
            ) {
                if (response.isSuccessful) {
                    val categoryData = response.body()
                    Log.i("ApiChecking", "responsebody: ${categoryData}")
                    if (categoryData != null) {
                        tempList = ArrayList()
                        tempList.add(categoryData)
                        _dataList.value = ArrayList(tempList)
                        callback(true)
                    }
                }
            }
            override fun onFailure(call: Call<CategoryDataClass>, t: Throwable) {
                return callback(false)
            }
        })
    }

    override fun fetchAnimation(callback: (Boolean) -> Unit) {
        apiClient.fetchAnimation(Token).enqueue(object : Callback<AnimationDataClass> {
            override fun onResponse(
                call: Call<AnimationDataClass>,
                response: Response<AnimationDataClass>
            ) {
                if (response.isSuccessful) {
                    val animationData = response.body()
                    Log.i("ApiChecking", "responsebody: ${animationData}")
                    if (animationData != null) {
                        tempListAnimation = ArrayList()
                        tempListAnimation.add(animationData)
                        dataListAnimation.value = ArrayList(tempListAnimation)
                        callback(true)
                    }
                }
            }

            override fun onFailure(call: Call<AnimationDataClass>, t: Throwable) {
                return callback(false)
            }
        })
    }


    override fun fetchTrendingAnimation() {
        apiClient.fetchTrendingAnimation(Token).enqueue(object : Callback<CategoryDataClass> {
            override fun onResponse(
                call: Call<CategoryDataClass>,
                response: Response<CategoryDataClass>
            ) {
                if (response.isSuccessful) {
//                    Log.e("responseofapi", response.body()?.data.toString())
                }
            }

            override fun onFailure(call: Call<CategoryDataClass>, t: Throwable) {

            }
        })
    }

    override fun check() {
        Log.e("callcheckfun", "I am working yes")
    }


}