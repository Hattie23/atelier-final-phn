package com.example.atelier6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {



        @FXML
        private Button add;

        @FXML
        private Button delete;

        @FXML
        private Button modify;

        @FXML
        private Button reasech;

        @FXML
        private Button liste;

        @FXML
        private Button displayNombre;

        @FXML
        private Button afficheValTotal;

        @FXML
        private Button btexit;

        @FXML
        private TableView<?> tableView; // Note: Use the specific type if you have one

    // Use specific type if necessary

        @FXML
        private void initialize() {
            // Set up button actions
            add.setOnAction(event -> openNewWindow("ajouter_livre.fxml"));
            delete.setOnAction(event -> openNewWindow("supprimer_produit.fxml"));
            modify.setOnAction(event -> openNewWindow("modifier_produit.fxml"));
            reasech.setOnAction(event -> openNewWindow("recherche_produit_par_id.fxml"));
            liste.setOnAction(event -> openNewWindow("recherche_produit_par_lettre.fxml"));
            displayNombre.setOnAction(event -> openNewWindow("DisplayProductCount.fxml"));
            afficheValTotal.setOnAction(event -> openNewWindow("DisplayTotalValue.fxml"));
            btexit.setOnAction(event -> exit());
        }

        private void openNewWindow(String fxmlFile) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
                showAlert("Error", "Could not load the window.");
            }
        }
        @FXML
        private void exit() {
            System.exit(0);
        }

        private void showAlert(String title, String message) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle(title);
            alert.setHeaderText(null);
            alert.setContentText(message);
            alert.showAndWait();
        }

}

