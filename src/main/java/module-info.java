module com.example.atelier6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.atelier6 to javafx.fxml;
    exports com.example.atelier6;
}