package com.example.newapp.repository

import com.example.newapp.NewsStates
import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun getTopHeadlines() : Flow<NewsStates>
}