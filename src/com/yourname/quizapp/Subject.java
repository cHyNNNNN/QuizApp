package com.yourname.quizapp;

import java.util.List;

public class Subject {
    private String name;
    private List<Question> questions;

    public Subject(String name, List<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
