module com.example.oop_fa22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_fa22 to javafx.fxml;
    exports com.example.oop_fa22;
}