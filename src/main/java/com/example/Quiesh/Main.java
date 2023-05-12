package com.example.Quiesh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application{

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("haha.fxml"));
        Parent root = loader.load();

        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Quiesh");
        stage.show();

    }

}

