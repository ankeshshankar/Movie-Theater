package com.movie.method;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("./../view/MainView.fxml"));
        primaryStage.setTitle("Book Movie Tickets");
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        primaryStage.setScene(new Scene(root, 890, 553));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
