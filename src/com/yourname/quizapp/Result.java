package com.yourname.quizapp;

public class Result {
    private Question question;
    private int givenAnswer;
    private boolean isCorrect;

    public Result(Question question, int givenAnswer, boolean isCorrect) {
        this.question = question;
        this.givenAnswer = givenAnswer;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Pregunta: " + question.getQuestionText() +
                "\nTu respuesta: " + question.getOptions()[givenAnswer - 1] +
                "\nCorrecta: " + (isCorrect ? "Sí" : "No") +
                "\nRespuesta correcta: " + question.getOptions()[question.getCorrectAnswer()] + "\n";
    }
}
