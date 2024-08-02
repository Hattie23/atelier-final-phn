package com.example.atelier6;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechercheProduitController {

    @FXML
    private TextField nomproduit;

    @FXML
    private Button rechercher;

    @FXML
    private Label idproduitLabel;

    @FXML
    private Label titreLabel;

    @FXML
    public void initialize() {
        // Initialisation ou configuration supplémentaire si nécessaire
        rechercher.setOnAction(event -> handleRechercherAction());
    }

    @FXML
    private void handleRechercherAction() {
        // Logique à exécuter lorsque le bouton "Rechercher" est cliqué
        String nomProduitText = nomproduit.getText();

        // Exemple de traitement de la recherche
        System.out.println("Nom du Produit: " + nomProduitText);

        // Ajouter ici la logique pour rechercher le produit, par exemple, interroger une base de données
    }
}
