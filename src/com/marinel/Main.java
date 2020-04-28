package com.marinel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        root.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 350, 473));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
