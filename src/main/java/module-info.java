module com.example.newewew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newewew to javafx.fxml;
    exports com.example.newewew;
}