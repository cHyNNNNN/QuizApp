package com.yourname.quizapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import com.yourname.quizapp.utils.QuestionLoader;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class QuizController {
    @FXML private Label questionLabel;
    @FXML private ToggleGroup optionsGroup = new ToggleGroup();
    @FXML private RadioButton option1;
    @FXML private RadioButton option2;
    @FXML private RadioButton option3;
    @FXML private RadioButton option4;

    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;

    public void setSubject(String subjectName) {
        // Cargar todas las preguntas y seleccionar 10 preguntas aleatorias
        List<Question> allQuestions = QuestionLoader.loadQuestions(subjectName);
        Collections.shuffle(allQuestions);
        questions = allQuestions.stream().limit(10).collect(Collectors.toList());
        loadQuestion();
    }

    private void loadQuestion() {
        Question question = questions.get(currentQuestionIndex);
        questionLabel.setText(question.getQuestionText());
        String[] options = question.getOptions();
        option1.setText(options[0]);
        option2.setText(options[1]);
        option3.setText(options[2]);
        option4.setText(options[3]);

        option1.setToggleGroup(optionsGroup);
        option2.setToggleGroup(optionsGroup);
        option3.setToggleGroup(optionsGroup);
        option4.setToggleGroup(optionsGroup);

        // Desmarcar todas las opciones
        optionsGroup.selectToggle(null);
    }

    @FXML
    public void nextQuestion() {
        RadioButton selectedOption = (RadioButton) optionsGroup.getSelectedToggle();
        if (selectedOption != null) {
            int selectedIndex = optionsGroup.getToggles().indexOf(selectedOption);
            if (questions.get(currentQuestionIndex).isCorrect(selectedIndex)) {
                score++;
            }
            currentQuestionIndex++;
            if (currentQuestionIndex < questions.size()) {
                loadQuestion();
            } else {
                showResult();
            }
        }
    }

    private void showResult() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/yourname/quizapp/resources/ResultsView.fxml"));
            Parent root = loader.load();

            ResultsController controller = loader.getController();
            controller.setResults(questions, score);

            Stage stage = new Stage();
            stage.setTitle("Resultados del Quiz");
            stage.setScene(new Scene(root));
            stage.show();

            // Cerrar la ventana del quiz
            Stage quizStage = (Stage) questionLabel.getScene().getWindow();
            quizStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
