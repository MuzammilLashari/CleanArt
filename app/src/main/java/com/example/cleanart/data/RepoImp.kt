package com.example.cleanart.data

import android.util.Log
import com.example.cleanart.ApiClient
import com.example.cleanart.business.Repo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoImp(val apiClient: ApiClient) : Repo {
    val Token = "token 10d3129ad0dae85fe360e01faa83fa7971e47c40"



    override fun fetchAnimation() {
        apiClient.fetchAnimation(Token).enqueue(object : Callback<DataClass> {
            override fun onResponse(call: Call<DataClass>, response: Response<DataClass>) {
                if (response.isSuccessful) {
                    Log.e("responseofapi", response.body()?.data.toString())
                }
            }

            override fun onFailure(call: Call<DataClass>, t: Throwable) {

            }
        })
    }

    override fun check() {
        Log.e("callcheckfun", "I am working yes")
    }

    override  fun gettingCategory(): Flow<List<categories>> = flow {

        Log.e("responseofapierror", "i am working")
        apiClient.fetchCategories(Token).enqueue(object : Callback<DataClass> {
            override fun onResponse(call: Call<DataClass>, response: Response<DataClass>) {
                if (response.isSuccessful) {
                    Log.e("responseofapi", response.body()?.data.toString())
                        CoroutineScope(Dispatchers.IO).launch {
                            emit(response.body()!!.data)
                        }
                }else{
                    Log.e("responseofapierror", response.toString())
                }
            }

            override fun onFailure(call: Call<DataClass>, t: Throwable) {
                Log.e("responseofapierror", t.message.toString())
            }
        })
    }.flowOn(Dispatchers.IO)
}