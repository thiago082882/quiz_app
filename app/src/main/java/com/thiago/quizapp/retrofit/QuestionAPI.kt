package com.thiago.quizapp.retrofit

import com.thiago.quizapp.model.Question
import com.thiago.quizapp.model.QuestionsList
import retrofit2.Response
import retrofit2.http.GET

interface QuestionAPI {

    @GET("questionsapi.php")
    suspend fun getQuestions(): Response<QuestionsList>
}