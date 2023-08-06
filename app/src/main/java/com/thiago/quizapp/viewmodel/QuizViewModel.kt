package com.thiago.quizapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.thiago.quizapp.model.Question
import com.thiago.quizapp.model.QuestionsList
import com.thiago.quizapp.repository.QuizRepository

class QuizViewModel : ViewModel() {

    var repository : QuizRepository = QuizRepository()
    lateinit var  questionLiveData: LiveData<QuestionsList>

    init {

        questionLiveData = repository.getQuestionsFromAPI()
    }

    fun getQuestionsFromLiveData(): LiveData<QuestionsList> {
        return questionLiveData
    }

}