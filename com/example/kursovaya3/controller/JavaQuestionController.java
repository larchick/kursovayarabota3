package com.example.kursovaya3.controller;

import com.example.kursovaya3.model.Question;
import com.example.kursovaya3.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question add (@RequestParam String text, @RequestParam String answer){
        return questionService.add(text,answer);
    }

    @GetMapping("/remove")
    public Question remove (@RequestParam String text, @RequestParam String answer){
        return questionService.remove(text,answer);
    }

    @GetMapping
    public Collection<Question> getAll(){
        return questionService.getAll();
    }
}
