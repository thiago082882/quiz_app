package com.thiago.quizapp.model

data class Question(
    val correctOption: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val question: String
)