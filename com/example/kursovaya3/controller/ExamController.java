package com.example.kursovaya3.controller;

import com.example.kursovaya3.model.Question;
import com.example.kursovaya3.service.ExaminerService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {

    public ExamController(ExaminerService examinerService){
        this.examinerService = examinerService;
    }
    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestion(@PathVariable int amount){
        return examinerServise.getQuestions(amount);
    }
}
