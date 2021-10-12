module com.example.ahouse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ahouse to javafx.fxml;
    exports com.example.ahouse;
}