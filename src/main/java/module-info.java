module com.example.first {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.first to javafx.fxml;
    exports com.example.first;
}