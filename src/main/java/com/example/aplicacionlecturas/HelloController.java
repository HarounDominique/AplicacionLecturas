package com.example.aplicacionlecturas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button salirButton;

    @FXML
    protected void onSalirButtonClick() {
        System.exit(1);
    }
}