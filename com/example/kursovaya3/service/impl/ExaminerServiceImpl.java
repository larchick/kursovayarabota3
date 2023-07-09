package com.example.kursovaya3.service.impl;

import com.example.kursovaya3.exeption.NoteEnoughQuestionsInStorage;
import com.example.kursovaya3.model.Question;
import com.example.kursovaya3.service.ExaminerService;
import com.example.kursovaya3.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()){
            throw new NoteEnoughQuestionsInStorage();
        }

        Set<Question> randomQuestion = new HashSet<>();

        while (randomQuestion.size() < amount){
            randomQuestion.add(questionService.getRandomQuestion());
        }

        return randomQuestion;
    }

}
