package com.yourname.quizapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class ResultsController {
    @FXML private Label scoreLabel;
    @FXML private VBox resultsContainer;
    @FXML private ScrollPane scrollPane;
    @FXML private Button mainMenuButton;

    public void initialize() {
        mainMenuButton.setOnAction(event -> goToMainMenu());
        resultsContainer.setPadding(new Insets(10, 10, 10, 10));
    }

    public void setResults(List<Question> questions, int score) {
        scoreLabel.setText("Tu puntuación: " + score + "/10");
        for (Question question : questions) {
            VBox questionBox = new VBox();
            questionBox.getStyleClass().add("question-box");

            Label questionLabel = new Label(question.getQuestionText());
            questionLabel.getStyleClass().add("question-text");
            questionLabel.setWrapText(true);
            questionBox.getChildren().add(questionLabel);

            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                Label optionLabel = new Label(options[i]);
                optionLabel.setWrapText(true);
                if (i == question.getCorrectAnswer()) {
                    optionLabel.getStyleClass().add("correct-answer");
                }
                if (!question.isCorrect(i) && i == getSelectedAnswerIndex(question)) {
                    optionLabel.getStyleClass().add("incorrect-answer");
                }
                questionBox.getChildren().add(optionLabel);
            }
            resultsContainer.getChildren().add(questionBox);
        }
    }

    private int getSelectedAnswerIndex(Question question) {
        // Implementa la lógica para obtener el índice de la respuesta seleccionada para la pregunta
        // Esta implementación dependerá de cómo se almacenen las respuestas seleccionadas
        return -1; // Cambia esto por la lógica adecuada
    }

    private void goToMainMenu() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/yourname/quizapp/resources/MainMenu.fxml"));
            Parent mainMenuRoot = loader.load();
            Scene mainMenuScene = new Scene(mainMenuRoot);
            Stage primaryStage = (Stage) mainMenuButton.getScene().getWindow();
            primaryStage.setScene(mainMenuScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
