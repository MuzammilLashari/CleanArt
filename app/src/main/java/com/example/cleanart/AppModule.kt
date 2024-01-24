package com.example.cleanart

import com.example.cleanart.business.UseCases
import com.example.cleanart.data.RepoImp
import com.example.cleanart.presentation.viewmodel.BatteryViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://172.16.10.51:8002")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiClient {
        return retrofit.create(ApiClient::class.java)
    }

    @Provides
    fun  provideBatteryRepoImp(apiClient: ApiClient):RepoImp{
        return RepoImp(apiClient)
    }
    @Provides
    fun provideBatteryUseCases(repoImp: RepoImp):UseCases{
        return  UseCases(repoImp)
    }
    @Provides
    fun provideBatteryViewModel(useCases: UseCases):BatteryViewModel{
        return  BatteryViewModel(useCases)
    }
}