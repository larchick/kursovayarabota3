package com.example.kursovaya3.service;

import com.example.kursovaya3.model.Question;

import java.util.Collection;
import java.util.Set;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
