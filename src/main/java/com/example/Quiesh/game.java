package com.example.Quiesh;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class game {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private int i = 1;
    @FXML
    void question(ActionEvent event) throws IOException {

        i++;

        System.out.println(i);

        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+i+".fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
}