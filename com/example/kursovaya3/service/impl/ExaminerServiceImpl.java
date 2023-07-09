package com.example.kursovaya3.service.impl;

import com.example.kursovaya3.model.Question;
import com.example.kursovaya3.service.ExaminerService;
import com.example.kursovaya3.service.QuestionService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> randomQuestion = new HashSet<>();

        while (randomQuestion.size() < amount){
            randomQuestion.add(questionService.getRandomQuestion());
        }

        return randomQuestion;
    }

}
