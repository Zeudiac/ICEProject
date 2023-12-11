package com.example;

import Model.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomeController {

    @FXML
    private Button createAccountButton;

    @FXML
    private Button loginButton;

    @FXML
    private AnchorPane welcomeAnchorPane;

    @FXML
    void login(ActionEvent event) throws IOException {
        new SceneSwitch(welcomeAnchorPane, "login.fxml");
    }

    @FXML
    void createAccount(ActionEvent event) {
    }



}

