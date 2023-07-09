package com.example.kursovaya3.model;

import java.util.Objects;

public class Question {

    private String test;
    private String answer;

    public Question(String test, String answer) {
        this.test = test;
        this.answer = answer;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(getTest(), question.getTest()) && Objects.equals(getAnswer(), question.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTest(), getAnswer());
    }

    @Override
    public String toString() {
        return "Question{" +
                "test='" + test + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
