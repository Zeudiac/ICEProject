package com.example;

import Model.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button backToMainButton;

    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void backToMain(ActionEvent event) throws IOException {
        new SceneSwitch(loginAnchorPane, "home.fxml");
    }
    @FXML
    void password(KeyEvent event) {

    }

    @FXML
    void username(KeyEvent event) {

    }

}
