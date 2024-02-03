module com.example.cholo_shikhi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cholo_shikhi to javafx.fxml;
    exports com.example.cholo_shikhi;
}