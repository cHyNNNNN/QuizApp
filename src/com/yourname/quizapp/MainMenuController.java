package com.yourname.quizapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {
    @FXML
    public void startFOLQuiz(ActionEvent event) {
        startQuiz("FOL", event);
    }

    @FXML
    public void startProgramacionAQuiz(ActionEvent event) {
        startQuiz("Programación A", event);
    }

    @FXML
    public void startProgramacionBQuiz(ActionEvent event) {
        startQuiz("Programación B", event);
    }

    @FXML
    public void startLenguajeMarcasQuiz(ActionEvent event) {
        startQuiz("Lenguaje de Marcas", event);
    }

    @FXML
    public void startBasesDatosBQuiz(ActionEvent event) {
        startQuiz("Bases de Datos B", event);
    }

    @FXML
    public void startEntornosDesarrolloQuiz(ActionEvent event) {
        startQuiz("Entornos de Desarrollo", event);
    }

    @FXML
    public void exitApp(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    private void startQuiz(String subjectName, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/yourname/quizapp/resources/QuizView.fxml"));
            Parent root = loader.load();

            QuizController controller = loader.getController();
            controller.setSubject(subjectName);

            Stage stage = new Stage();
            stage.setTitle(subjectName + " Quiz");
            stage.setScene(new Scene(root));
            stage.show();

            // Close the main menu window
            Stage mainStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            mainStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
