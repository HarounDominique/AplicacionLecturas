module com.example.aplicacionlecturas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aplicacionlecturas to javafx.fxml;
    exports com.example.aplicacionlecturas;
}