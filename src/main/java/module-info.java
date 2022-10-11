module com.application.javafx_chat_messenger_application {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.application.javafx_chat_messenger_application.client;
    opens com.application.javafx_chat_messenger_application.client to javafx.fxml;
    exports com.application.javafx_chat_messenger_application.server;
    opens com.application.javafx_chat_messenger_application.server to javafx.fxml;
}