package com.example.kursovaya3.service.impl;

import com.example.kursovaya3.model.Question;
import com.example.kursovaya3.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;
@Service
public class JavaQuestionService implements QuestionService {

    private final List<Question> questions = new ArrayList<>();
    private final Random random = new Random();


    @PostConstruct
    public void setup(){
        questions.add(new Question("Сколько метров в километре?", "Тысяча"));
        questions.add(new Question("Сколько будет дважды два?", "Четыре"));
        questions.add(new Question("А?", "Б"));
        questions.add(new Question("Кто написал Войну и мир?", "Лев Толстой"));
    }


    @Override
    public Question add(String text, String answer) {
        Question question = new Question(text,answer);
        questions.add(question);
        return question;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(String text, String answer) {
        return remove(new Question(text,answer));
    }

    @Override
    public Question remove(Question question) {
        boolean isRemoved = questions.remove(question);
        return isRemoved ? question : null;
    }

    @Override
    public Collection<Question> getAll() {
        return new ArrayList<>(questions);
    }

    @Override
    public Question getRandomQuestion() {
        int randomIndex = random.nextInt(questions.size());
        return questions.get(randomIndex);
    }
}
