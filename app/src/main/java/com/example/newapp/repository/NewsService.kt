package com.example.newapp.repository

import com.example.newapp.Constants
import com.example.newapp.NewsData
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {

    @GET("top-headlines?lang=en&token=${Constants.API_KEY}")
    suspend fun getTopHeadlines() : Response<NewsData>


}