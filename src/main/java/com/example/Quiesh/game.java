package com.example.Quiesh;

import java.io.IOException;

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

        String answerq1 = q1Ans1.getText() + q1Ans2.getText() + q1Ans3.getText() + q1Ans4.getText() + q1Ans5.getText() + q1Ans6.getText() + q1Ans7.getText() + q1Ans8.getText() + q1Ans9.getText() + q1Ans10.getText() + q1Ans11.getText() + q1Ans12.getText() + q1Ans13.getText() + q1Ans14.getText();
        System.out.println(answerq1);

        if (answerq1.equalsIgnoreCase("systemsoftware")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q2.fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            
        } else {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q1.fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }

    }

    @FXML private TextField q2Ans1,q2Ans2,q2Ans3,q2Ans4,q2Ans5,q2Ans6,q2Ans7,q2Ans8,q2Ans9,q2Ans10,q2Ans11,q2Ans12;

    @FXML
    void question2(ActionEvent event) throws IOException {

        String answerq2 = q2Ans1.getText() + q2Ans2.getText() + q2Ans3.getText() + q2Ans4.getText() + q2Ans5.getText() + q2Ans6.getText() + q2Ans7.getText() + q2Ans8.getText() + q2Ans9.getText() + q2Ans10.getText() + q2Ans11.getText() + q2Ans12.getText();

        if (answerq2.equalsIgnoreCase("memorysystem")) {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q3.fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q2.fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML private TextField q3Ans1,q3Ans2,q3Ans3,q3Ans4,q3Ans5,q3Ans6,q3Ans7,q3Ans8,q3Ans9,q3Ans10,q3Ans11;

    @FXML
    void question3(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q4.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q4Ans1,q4Ans2,q4Ans3,q4Ans4,q4Ans5,q4Ans6,q4Ans7,q4Ans8,q4Ans9,q4Ans10,q4Ans11,q4Ans12,q4Ans13,q4Ans14;

    @FXML
    void question4(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q5.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q5Ans1,q5Ans2,q5Ans3,q5Ans4,q5Ans5,q5Ans6,q5Ans7,q5Ans8,q5Ans9,q5Ans10,q5Ans11,q5Ans12;

    @FXML
    void question5(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q6.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q6Ans1,q6Ans2,q6Ans3,q6Ans4,q6Ans5,q6Ans6,q6Ans7,q6Ans8,q6Ans9,q6Ans10,q6Ans11,q6Ans12,q6Ans13,q6Ans14,q6Ans15;

    @FXML
    void question6(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q7.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q7Ans1,q7Ans2,q7Ans3,q7Ans4,q7Ans5,q7Ans6,q7Ans7,q7Ans8,q7Ans9,q7Ans10,q7Ans11,q7Ans12,q7Ans13,q7Ans14,q7Ans15;

    @FXML
    void question7(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q8.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q8Ans1,q8Ans2,q8Ans3,q8Ans4,q8Ans5,q8Ans6,q8Ans7,q8Ans8,q8Ans9,q8Ans10;

    @FXML
    void question8(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q9.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q9Ans1,q9Ans2,q9Ans3,q95ns4,q9Ans5,q9Ans6,q9Ans7,q9Ans8,q9Ans9,q9Ans10,q9Ans11,q9Ans12;

    @FXML
    void question9(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q10.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q10Ans1,q10Ans2,q10Ans3,q10Ans4,q10Ans5,q10Ans6,q10Ans7,q10Ans8,q10Ans9,q10Ans10,q10Ans11,q10Ans12,q10Ans13,q10Ans14,q10Ans15,q10Ans16,q10Ans17,q10Ans18,q10Ans19,q10Ans20,q10Ans21,q10Ans22,q10Ans23;

    @FXML
    void question10(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q11.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q11Ans1,q11Ans2,q11Ans3,q11Ans4,q11Ans5,q11Ans6,q11Ans7;

    @FXML
    void question11(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q12.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q12Ans1,q12Ans2,q12Ans3,q12Ans4,q12Ans5,q12Ans6,q12Ans7,q12Ans8,q12Ans9,q12Ans10,q12Ans11;

    @FXML
    void question12(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q13.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q13Ans1,q13Ans2,q13Ans3,q13Ans4,q13Ans5,q13Ans6,q13Ans7,q13Ans8,q13Ans9;

    @FXML
    void question13(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q14.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q14Ans1,q14Ans2,q14Ans3,q14Ans4,q14Ans5,q14Ans6,q14Ans7,q14Ans8,q14Ans9,q14Ans10,q14Ans11,q14Ans12,q14Ans13,q14Ans14,q14Ans15,q14Ans16,q14Ans17,q14Ans18,q14Ans19;

    @FXML
    void question14(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q15.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q15Ans1,q15Ans2,q15Ans3,q15Ans4,q15Ans5,q15Ans6,q15Ans7,q15Ans8,q15Ans9,q15Ans10,q15Ans11,q15Ans12,q15Ans13;

    @FXML
    void question15(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q16.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q16Ans1,q16Ans2,q16Ans3,q16Ans4,q16Ans5,q16Ans6,q16Ans7,q16Ans8;

    @FXML
    void question16(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q17.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q17Ans1,q17Ans2,q17Ans3,q17Ans4,q17Ans5,q17Ans6,q17Ans7,q17Ans8;

    @FXML
    void question17(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q18.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q18Ans1,q18Ans2,q18Ans3,q18Ans4,q18Ans5,q18Ans6,q18Ans7,q18Ans8,q18Ans9,q18Ans10;

    @FXML
    void question18(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q19.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q19Ans1,q19Ans2,q19Ans3,q19Ans4,q19Ans5,q19Ans6,q19Ans7,q19Ans8,q19Ans9;

    @FXML
    void question19(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q20.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private TextField q20Ans1,q20Ans2,q20Ans3,q20ns4,q20Ans5,q20Ans6,q20Ans7,q20Ans8,q20Ans9,q20Ans10,q20Ans11,q20Ans12,q20Ans13;

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
