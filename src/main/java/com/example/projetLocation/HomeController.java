package com.example.projetLocation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    private Parent fxml;
    @FXML
    private AnchorPane root;

    @FXML
    void accueil(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("accueil.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void contrat(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("contrat.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void facture(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("facture.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void historique(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("historique.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void locataire(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("locataire.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void location(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("location.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void logement(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("logement.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
