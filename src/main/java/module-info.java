module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetLocation to javafx.fxml;
    exports com.example.projetLocation;
}