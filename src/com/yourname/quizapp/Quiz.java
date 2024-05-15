package com.yourname.quizapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.yourname.quizapp.utils.QuestionLoader;

public class Quiz {
    private Subject subject;

    public Quiz(String subjectName) {
        this.subject = new Subject(subjectName, QuestionLoader.loadQuestions(subjectName));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>(subject.getQuestions());
        Collections.shuffle(questions); // Mezcla las preguntas
        int score = 0;
        List<Result> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // 10 preguntas
            Question question = questions.get(i);
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }
            int answer = scanner.nextInt();
            boolean isCorrect = question.isCorrect(answer - 1);
            if (isCorrect) {
                score++;
            }
            results.add(new Result(question, answer, isCorrect));
        }
        System.out.println("Tu puntuación: " + score + "/10");
        for (Result result : results) {
            System.out.println(result);
        }
    }
}
