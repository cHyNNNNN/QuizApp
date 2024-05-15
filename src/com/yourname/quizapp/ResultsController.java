package com.yourname.quizapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.List;

public class ResultsController {
    @FXML private Label scoreLabel;
    @FXML private VBox resultsContainer;

    public void setResults(List<Question> questions, int score) {
        scoreLabel.setText("Tu puntuación: " + score + "/10");
        for (Question question : questions) {
            Label questionLabel = new Label(question.getQuestionText());
            resultsContainer.getChildren().add(questionLabel);

            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                Label optionLabel = new Label(options[i]);
                if (i == question.getCorrectAnswer()) {
                    optionLabel.setStyle("-fx-text-fill: green;");
                }
                resultsContainer.getChildren().add(optionLabel);
            }
        }
    }
}
