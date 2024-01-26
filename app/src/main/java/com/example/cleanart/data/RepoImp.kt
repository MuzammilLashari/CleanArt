package com.example.cleanart.data

import android.util.Log
import com.example.cleanart.ApiClient
import com.example.cleanart.business.Repo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoImp(val apiClient: ApiClient) : Repo {
    val Token = "token 10d3129ad0dae85fe360e01faa83fa7971e47c40"

    override fun postCategories(){
        apiClient.postCategories(Token).enqueue(object : Callback<DataClass> {
            override fun onResponse(call: Call<DataClass>, response: Response<DataClass>) {
                if (response.isSuccessful) {
                    Log.e("responseofapi", response.body()?.data.toString())
                }
            }
            override fun onFailure(call: Call<DataClass>, t: Throwable) {

            }
        })
    }

    override fun gettingCategory() {
        apiClient.fetchCategories(Token).enqueue(object : Callback<DataClass> {
            override fun onResponse(call: Call<DataClass>, response: Response<DataClass>) {
                if (response.isSuccessful) {
                    Log.e("responseofapi", response.body()?.data.toString())
                }
            }
            override fun onFailure(call: Call<DataClass>, t: Throwable) {

            }
        })
    }




}