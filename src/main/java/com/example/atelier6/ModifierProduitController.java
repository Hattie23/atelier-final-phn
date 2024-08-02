package com.example.atelier6;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ModifierProduitController {

    @FXML
    private TextField idproduit;

    @FXML
    private TextField nouveauprix;

    @FXML
    private TextField nouveaunoom;

    @FXML
    private Button modifierButton;

    @FXML
    private Label idproduitLabel;

    @FXML
    private Label nouveaunoomLabel;

    @FXML
    private Label nouveauprixLabel;

    @FXML
    public void initialize() {
        // Initialisation ou configuration supplémentaire si nécessaire
        modifierButton.setOnAction(event -> handleModifierAction());
    }

    @FXML
    private void handleModifierAction() {
        // Logique à exécuter lorsque le bouton "Modifier" est cliqué
        String idProduitText = idproduit.getText();
        String nouveauNomText = nouveaunoom.getText();
        String nouveauPrixText = nouveauprix.getText();

        // Exemple de traitement des données
        System.out.println("ID Produit: " + idProduitText);
        System.out.println("Nouveau Nom: " + nouveauNomText);
        System.out.println("Nouveau Prix: " + nouveauPrixText);

        // Ajouter ici la logique pour modifier le produit, par exemple, mettre à jour la base de données
    }
}
