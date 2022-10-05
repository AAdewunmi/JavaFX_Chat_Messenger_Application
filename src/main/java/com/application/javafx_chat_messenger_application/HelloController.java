package com.application.javafx_chat_messenger_application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
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
            try{
                server = new Server(new ServerSocket(1234));
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("Error creating server ... ");
            }
            vBox_messages.heightProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    sp_main.setVvalue((Double) newValue);
                }
            });
    }

}