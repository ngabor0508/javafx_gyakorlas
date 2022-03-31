module com.example.javafx_gyakorlas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_gyakorlas to javafx.fxml;
    exports com.example.javafx_gyakorlas;
}