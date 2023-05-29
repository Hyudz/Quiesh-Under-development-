package com.example.Quiesh;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;

public class difficult extends player{

    private Stage stage;
    private Scene scene;
    private Parent root;

    Random randInt = new Random();
    int round = randInt.nextInt(19);

    player player = new player();

    @FXML Label questionNo;
    
    @FXML
    void ezMode(ActionEvent event) throws IOException {
        player.lives = 3;
        int question = round + 1;
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+question+".fxml"));
        player.level = question;
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
    }
    @FXML
    void challenging(ActionEvent event) throws IOException {
        player.lives = 3;
        int question = round + 1;
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+question+".fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
