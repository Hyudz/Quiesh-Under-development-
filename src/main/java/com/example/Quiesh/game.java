package com.example.Quiesh;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class game {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private TextField q1Ans1,q1Ans2,q1Ans3,q1Ans4,q1Ans5,q1Ans6,q1Ans7,q1Ans8,q1Ans9,q1Ans10,q1Ans11,q1Ans12,q1Ans13,q1Ans14;

    @FXML
    void question1(ActionEvent event) throws IOException {

        // String answerq1 = q1Ans1.getText() + q1Ans2.getText() + q1Ans3.getText() + q1Ans4.getText() + q1Ans5.getText() + q1Ans6.getText() + q1Ans7.getText() + q1Ans8.getText() + q1Ans9.getText() + q1Ans10.getText() + q1Ans11.getText() + q1Ans12.getText() + q1Ans13.getText() + q1Ans14.getText();
        // System.out.println(answerq1);

        // if (answerq1.equalsIgnoreCase("systemsoftware")) {
            
        // } else {

        // }

        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q2.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void question2(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q3.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question3(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q4.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question4(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q5.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question5(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q6.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question6(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q7.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question7(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q8.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question8(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q9.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question9(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q10.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question10(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q11.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question11(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q12.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question12(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q13.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question13(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q14.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question14(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q15.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question15(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q16.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question16(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q17.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question17(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q18.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question18(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q19.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question19(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q20.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void question20(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("haha.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
