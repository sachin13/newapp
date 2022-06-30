package com.example.newapp

sealed class NewsStates {
    data class Success(val news: NewsData) : NewsStates()
    data class Error(val errorMessage: String) : NewsStates()
    object Loading : NewsStates()
}