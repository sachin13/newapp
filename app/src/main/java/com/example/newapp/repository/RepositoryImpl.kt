package com.example.newapp.repository



import com.example.newapp.NewsStates
import kotlinx.coroutines.flow.flow


class RepositoryImpl : Repository {

    override suspend fun getTopHeadlines() = flow {

        emit(NewsStates.Loading)

        val response = RetrofitClient.getInstance().apiService.getTopHeadlines()
        if (response.isSuccessful){
            emit(NewsStates.Success(response.body()!!))
        }else{
            emit(NewsStates.Error(response.errorBody().toString()))
        }

    }
}
