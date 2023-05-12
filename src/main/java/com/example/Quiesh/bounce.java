package com.example.Quiesh;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class bounce {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void mode(ActionEvent event) throws IOException {
        System.out.println("Working");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("difficulties.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
