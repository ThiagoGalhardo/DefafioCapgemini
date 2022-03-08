module com.example.defafiocap {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.defafiocap to javafx.fxml;
    exports com.example.defafiocap;
}