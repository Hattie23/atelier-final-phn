package com.example.atelier6;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DeleteProductController {

    @FXML
    private TextField idTextField;

    @FXML
    private Button deleteButton;

    @FXML
    private Label resultLabel;

    @FXML
    private Text infoText;

    @FXML
    private void initialize() {
        // Ajoutez un gestionnaire d'événements pour le bouton "Supprimer"
        deleteButton.setOnAction(event -> handleDeleteAction());
    }

    private void handleDeleteAction() {
        String productId = idTextField.getText();

        if (productId.isEmpty()) {
            resultLabel.setText("Veuillez entrer un ID produit.");
        } else {

            resultLabel.setText("Produit avec ID " + productId + " supprimé.");
        }
    }
}

