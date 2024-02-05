module com.example.cholo_siikhi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cholo_siikhi to javafx.fxml;
    exports com.example.cholo_siikhi;
}