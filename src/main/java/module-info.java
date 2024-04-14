module com.example.repo13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repo13 to javafx.fxml;
    exports com.example.repo13;
}