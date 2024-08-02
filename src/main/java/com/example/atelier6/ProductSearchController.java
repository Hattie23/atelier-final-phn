package com.example.atelier6;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ProductSearchController {

    @FXML
    private TextField nomproduit;

    @FXML
    private Button rechercher;

    @FXML
    private Label resultatLabel;

    @FXML
    private void initialize() {
        rechercher.setOnAction(event -> handleRechercherAction());
    }
    private void handleRechercherAction() {
        String produitNom = nomproduit.getText();

        if (produitNom.isEmpty()) {
            resultatLabel.setText("Veuillez entrer un nom de produit.");
        } else {
            resultatLabel.setText("Produit recherché : " + produitNom);
        }
    }
}
