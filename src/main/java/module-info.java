module com.example.f21comp1011gcw3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.f21comp1011gcw3 to javafx.fxml;
    exports com.example.f21comp1011gcw3;
}