package com.yourname.quizapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

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
