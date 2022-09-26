module com.application.javafx_chat_messenger_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application.javafx_chat_messenger_application to javafx.fxml;
    exports com.application.javafx_chat_messenger_application;
}