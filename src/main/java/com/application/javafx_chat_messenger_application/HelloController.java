package com.application.javafx_chat_messenger_application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.ServerSocket;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button button_send;
    @FXML
    private TextField tf_message;
    @FXML
    private VBox vBox_messages;
    @FXML
    private ScrollPane sp_main;

    private Server server;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}