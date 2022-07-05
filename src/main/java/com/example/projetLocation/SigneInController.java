package com.example.projetLocation;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SigneInController implements Initializable {
    @FXML
    private VBox VBox;
    @FXML
    private Button btn_passwordForgoten;

    @FXML
    private Button btn_signIn;

    @FXML
    private TextField txt_password;

    @FXML
    private TextField txt_userName;
    private Parent fxml;


    @FXML
    void openHome() {
        String nom = txt_userName.getText();
        String pass = txt_password.getText();
        if (nom.equals("dezero") && pass.equals("dezero")) {
            System.out.println("OK");
            VBox.getScene().getWindow().hide();
            Stage home = new Stage();

            try {
                fxml = FXMLLoader.load(getClass().getResource("home.fxml"));
                Scene scene = new Scene(fxml);
                home.setScene(scene);
                home.show();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("error");
        }

    }

    @FXML
    void sendPassword() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
