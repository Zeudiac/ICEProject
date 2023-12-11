module com.example.iceproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.iceproject to javafx.fxml;
    exports com.example.iceproject;
}