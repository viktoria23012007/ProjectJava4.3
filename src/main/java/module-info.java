module com.example.main6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.main6 to javafx.fxml;
    exports com.example.main6;
}