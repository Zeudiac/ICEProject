module com.example.iceproject {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example;
    opens com.example to javafx.fxml;
}