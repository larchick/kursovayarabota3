package com.example.kursovaya3.service;

import com.example.kursovaya3.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String text, String answer);
    Question add(Question question);
    Question remove(String text, String answer);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
