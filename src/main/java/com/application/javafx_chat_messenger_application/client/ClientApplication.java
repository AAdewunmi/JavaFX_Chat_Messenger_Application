package com.application.javafx_chat_messenger_application.client;
/**
 * Client Main Class
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("client-view.fxml"));
        primaryStage.setTitle("Client!");
        primaryStage.setScene(new Scene(root, 480, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
