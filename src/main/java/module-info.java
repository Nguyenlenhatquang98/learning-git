module com.example.learnjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learnjava to javafx.fxml;
    exports com.example.learnjava;
}