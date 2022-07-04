package com.example.projetLocation;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Pane VBox;

    @FXML
    private Button btn_seConnecter;

    @FXML
    private Button btn_sinscrire;

    private Parent fxml;

    @FXML
    void openSigneIn() {
        TranslateTransition t = new TranslateTransition(Duration.seconds(1), VBox);
        t.setToX(VBox.getLayoutX() * 4.5);
        t.play();
        t.setOnFinished(e -> {
            try {
                fxml = FXMLLoader.load(getClass().getResource("SigneIn.fxml"));
                VBox.getChildren().removeAll();
                VBox.getChildren().setAll(fxml);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });
    }

    @FXML
    void openSigneUp() {
        TranslateTransition t = new TranslateTransition(Duration.seconds(1), VBox);
        t.setToX(5);
        t.play();
        t.setOnFinished(e -> {
            try {
                fxml = FXMLLoader.load(getClass().getResource("SigneUp.fxml"));
                VBox.getChildren().removeAll();
                VBox.getChildren().setAll(fxml);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TranslateTransition t = new TranslateTransition(Duration.seconds(1), VBox);
        t.setToX(VBox.getLayoutX() * 4.5);
        t.play();

    }
}