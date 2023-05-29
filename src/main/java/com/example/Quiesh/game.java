package com.example.Quiesh;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;


public class game extends player{

    private Stage stage;
    private Scene scene;
    private Parent root;

    Random randInt = new Random();
    int round = randInt.nextInt(19);
    int questionn = round + 1;


    void returnBack(ActionEvent event) throws IOException{
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("haha.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    void win(ActionEvent event) throws IOException{
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("win.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        player.round = 1;
        player.lives = 3;
    }

    void loose(ActionEvent event) throws IOException{
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("loose.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void pause(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("pause.fxml"));
        Parent root = loader1.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML Label questionNo;

    @FXML private TextField q1Ans1,q1Ans2,q1Ans3,q1Ans4,q1Ans5,q1Ans6,q1Ans7,q1Ans8,q1Ans9,q1Ans10,q1Ans11,q1Ans12,q1Ans13,q1Ans14;

    @FXML
    void question1(ActionEvent event) throws IOException {

        System.out.println(player.round);
        String answerq1 = q1Ans1.getText() + q1Ans2.getText() + q1Ans3.getText() + q1Ans4.getText() + q1Ans5.getText() + q1Ans6.getText() + q1Ans7.getText() + q1Ans8.getText() + q1Ans9.getText() + q1Ans10.getText() + q1Ans11.getText() + q1Ans12.getText() + q1Ans13.getText() + q1Ans14.getText();
        if (player.round == 10) {
            win(event);
        }
        else if (answerq1.equalsIgnoreCase("systemsoftware")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));

            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            player.round++;
        } else {
            player.lives = player.lives - 1;
            System.out.println(player.lives);

            for (int i= 1; i<=14; i++){

                q1Ans1.getScene().lookup("#q1Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");
                
            }

            q1Ans2.setText("");
            q1Ans5.setText("");
            q1Ans6.setText("");
            q1Ans9.setText("");
            q1Ans10.setText("");
            q1Ans12.setText(""); 

            if (player.lives == 0) {
                loose(event);
            }

            Timer time = new Timer();
            TimerTask task = new TimerTask() {

                @Override
                public void run() {
                    for (int i= 1; i<=14; i++){

                        q1Ans1.getScene().lookup("#q1Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
                
            };

            time.schedule(task, 2000);
        }

    }

    @FXML private TextField q2Ans1,q2Ans2,q2Ans3,q2Ans4,q2Ans5,q2Ans6,q2Ans7,q2Ans8,q2Ans9,q2Ans10,q2Ans11,q2Ans12;

    @FXML
    void question2(ActionEvent event) throws IOException {

        String answerq2 = q2Ans1.getText() + q2Ans2.getText() + q2Ans3.getText() + q2Ans4.getText() + q2Ans5.getText() + q2Ans6 .getText() +q2Ans7.getText() + q2Ans8.getText() + q2Ans9.getText() + q2Ans10.getText() + q2Ans11.getText() + q2Ans12.getText();
        System.out.println(player.lives);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq2.equalsIgnoreCase("memorysystem")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));

            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=12; i++){

                q2Ans1.getScene().lookup("#q2Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q2Ans1.setText("");
            q2Ans4.setText("");
            q2Ans8.setText("");
            q2Ans8.setText("");
            q2Ans11.setText("");
            q2Ans12.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=12; i++){

                        q2Ans1.getScene().lookup("#q2Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            System.out.println(player.lives);
            player.lives = player.lives - 1;
            if (player.lives == 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q3Ans1,q3Ans2,q3Ans3,q3Ans4,q3Ans5,q3Ans6,q3Ans7,q3Ans8,q3Ans9,q3Ans10,q3Ans11;

    @FXML
    void question3(ActionEvent event) throws IOException {

        String answerq3 = q3Ans1.getText() + q3Ans2.getText() + q3Ans3.getText() + q3Ans4.getText() + q3Ans5.getText() + q3Ans6.getText() + q3Ans7.getText() + q3Ans8.getText() + q3Ans9.getText() + q3Ans10.getText() + q3Ans11.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq3.equalsIgnoreCase("inputdevice")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
            
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=11; i++){

                q3Ans1.getScene().lookup("#q3Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q3Ans1.setText("");
            q3Ans2.setText("");
            q3Ans4.setText("");
            q3Ans7.setText("");
            q3Ans8.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=11; i++){

                        q3Ans1.getScene().lookup("#q3Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            player.lives = player.lives - 1;
            if (player.lives == 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q4Ans1,q4Ans2,q4Ans3,q4Ans4,q4Ans5,q4Ans6,q4Ans7,q4Ans8,q4Ans9,q4Ans10,q4Ans11,q4Ans12,q4Ans13,q4Ans14;

    @FXML
    void question4(ActionEvent event) throws IOException {

        String answerq4 = q4Ans1.getText() + q4Ans2.getText() + q4Ans3.getText() + q4Ans4.getText() + q4Ans5.getText() + q4Ans6.getText() + q4Ans7.getText() + q4Ans8.getText() + q4Ans9.getText() + q4Ans10.getText() + q4Ans11.getText() + q4Ans12.getText() + q4Ans13.getText() + q4Ans14.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq4.equalsIgnoreCase("multitaskingos")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
            
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=14; i++){

                q4Ans1.getScene().lookup("#q4Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q4Ans3.setText("");
            q4Ans4.setText("");
            q4Ans8.setText("");
            q4Ans9.setText("");
            q4Ans12.setText("");
            q4Ans14.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=14; i++){

                        q4Ans1.getScene().lookup("#q4Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q5Ans1,q5Ans2,q5Ans3,q5Ans4,q5Ans5,q5Ans6,q5Ans7,q5Ans8,q5Ans9,q5Ans10,q5Ans11,q5Ans12;

    @FXML
    void question5(ActionEvent event) throws IOException {
        String answerq5 = q5Ans1.getText() + q5Ans2.getText() + q5Ans3.getText() + q5Ans4.getText() + q5Ans5.getText() + q5Ans6.getText() + q5Ans7.getText() + q5Ans8.getText() + q5Ans9.getText() + q5Ans10.getText() + q5Ans11.getText() + q5Ans12.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq5.equalsIgnoreCase("outputdevice")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));

            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=12; i++){

                q5Ans1.getScene().lookup("#q5Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q5Ans3.setText("");
            q5Ans4.setText("");
            q5Ans8.setText("");
            q5Ans11.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=12; i++){

                        q5Ans1.getScene().lookup("#q5Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q6Ans1,q6Ans2,q6Ans3,q6Ans4,q6Ans5,q6Ans6,q6Ans7,q6Ans8,q6Ans9,q6Ans10,q6Ans11,q6Ans12,q6Ans13,q6Ans14,q6Ans15;

    @FXML
    void question6(ActionEvent event) throws IOException {
        String answerq6 =  q6Ans1.getText() + q6Ans2.getText() + q6Ans3.getText() + q6Ans4.getText() + q6Ans5.getText() + q6Ans6.getText() + q6Ans7.getText() + q6Ans8.getText() + q6Ans9.getText() + q6Ans10.getText() + q6Ans11.getText() + q6Ans12.getText() + q6Ans13.getText() + q6Ans14.getText() + q6Ans15.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq6.equalsIgnoreCase("operatingsystem")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));

            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;

        }

        else {

            for (int i= 1; i<=15; i++){

                q5Ans1.getScene().lookup("#q6Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q6Ans1.setText("");
            q6Ans4.setText("");
            q6Ans6.setText("");
            q6Ans11.setText("");
            q6Ans14.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=15; i++){

                        q5Ans1.getScene().lookup("#q6Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q7Ans1,q7Ans2,q7Ans3,q7Ans4,q7Ans5,q7Ans6,q7Ans7,q7Ans8,q7Ans9,q7Ans10,q7Ans11,q7Ans12,q7Ans13,q7Ans14,q7Ans15;

    @FXML
    void question7(ActionEvent event) throws IOException {
        String answerq7 = q7Ans1.getText() + q7Ans2.getText() + q7Ans3.getText() + q7Ans4.getText() + q7Ans5.getText() + q7Ans6.getText() + q7Ans7.getText() + q7Ans8.getText() + q7Ans9.getText() + q7Ans10.getText() + q7Ans11.getText() + q7Ans12.getText() + q7Ans13.getText() + q7Ans14.getText() + q7Ans15.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq7.equalsIgnoreCase("userlevelthread")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                        
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;

        }
        else {
            for (int i= 1; i<=15; i++){

                q7Ans1.getScene().lookup("#q7Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q7Ans3.setText("");
            q7Ans6.setText("");
            q7Ans11.setText("");
            q7Ans13.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=15; i++){

                        q7Ans1.getScene().lookup("#q7Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q8Ans1,q8Ans2,q8Ans3,q8Ans4,q8Ans5,q8Ans6,q8Ans7,q8Ans8,q8Ans9,q8Ans10;

    @FXML
    void question8(ActionEvent event) throws IOException {
        String answerq8 = q8Ans1.getText() + q8Ans2.getText() + q8Ans3.getText() + q8Ans4.getText() + q8Ans5.getText() + q8Ans6.getText() + q8Ans7.getText() + q8Ans8.getText() + q8Ans9.getText() + q8Ans10.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq8.equalsIgnoreCase("processing")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                        
            player.level = questionn;   
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=10; i++){

                q8Ans1.getScene().lookup("#q8Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q8Ans1.setText("");
            q8Ans4.setText("");
            q8Ans6.setText("");
            q8Ans9.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=10; i++){

                        q8Ans1.getScene().lookup("#q8Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q9Ans1,q9Ans2,q9Ans3,q9Ans4,q9Ans5,q9Ans6,q9Ans7,q9Ans8,q9Ans9,q9Ans10,q9Ans11,q9Ans12;

    @FXML
    void question9(ActionEvent event) throws IOException {

        String answerq9 = q9Ans1.getText() + q9Ans2.getText() + q9Ans3.getText() + q9Ans4.getText() + q9Ans5.getText() + q9Ans6.getText() + q9Ans7.getText() + q9Ans8.getText() + q9Ans9.getText() + q9Ans10.getText() + q9Ans11.getText() + q9Ans12.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq9.equalsIgnoreCase("memorydevice")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                        
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=12; i++){

                q9Ans1.getScene().lookup("#q9Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q9Ans2.setText("");
            q9Ans3.setText("");
            q9Ans5.setText("");
            q9Ans9.setText("");
            q9Ans11.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=14; i++){

                        q9Ans1.getScene().lookup("#q9Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q10Ans1,q10Ans2,q10Ans3,q10Ans4,q10Ans5,q10Ans6,q10Ans7,q10Ans8,q10Ans9,q10Ans10,q10Ans11,q10Ans12,q10Ans13,q10Ans14,q10Ans15,q10Ans16,q10Ans17,q10Ans18,q10Ans19,q10Ans20,q10Ans21,q10Ans22,q10Ans23;

    @FXML
    void question10(ActionEvent event) throws IOException {
        String answerq10 = q10Ans1.getText() + q10Ans2.getText() + q10Ans3.getText() + q10Ans4.getText() + q10Ans5.getText() + q10Ans6.getText() + q10Ans7.getText() + q10Ans8.getText() + q10Ans9.getText() + q10Ans10.getText() + q10Ans11.getText() + q10Ans12.getText() + q10Ans13.getText() + q10Ans14.getText() + q10Ans15.getText() + q10Ans16.getText() + q10Ans17.getText() + q10Ans18.getText() + q10Ans19.getText() + q10Ans20.getText() + q10Ans21.getText() + q10Ans22.getText() + q10Ans23.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq10.equalsIgnoreCase("informativepresentation")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                        
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=23; i++){

                q10Ans1.getScene().lookup("#q10Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q10Ans3.setText("");
            q10Ans6.setText("");
            q10Ans13.setText("");
            q10Ans15.setText("");
            q10Ans19.setText("");
            q10Ans22.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=23; i++){

                        q10Ans1.getScene().lookup("#q10Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q11Ans1,q11Ans2,q11Ans3,q11Ans4,q11Ans5,q11Ans6,q11Ans7;

    @FXML
    void question11(ActionEvent event) throws IOException {

        String answerq11 = q11Ans1.getText() + q11Ans2.getText() + q11Ans3.getText() + q11Ans4.getText() + q11Ans5.getText() + q11Ans6.getText() + q11Ans7.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq11.equalsIgnoreCase("batchos")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));

            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=7; i++){

                q11Ans1.getScene().lookup("#q11Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q11Ans1.setText("");
            q11Ans3.setText("");
            q11Ans4.setText("");
            q11Ans6.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=14; i++){

                        q11Ans1.getScene().lookup("#q11Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q12Ans1,q12Ans2,q12Ans3,q12Ans4,q12Ans5,q12Ans6,q12Ans7,q12Ans8,q12Ans9,q12Ans10,q12Ans11;

    @FXML
    void question12(ActionEvent event) throws IOException {
        String answerq12 = q12Ans1.getText() + q12Ans2.getText() + q12Ans3.getText() + q12Ans4.getText() + q12Ans5.getText() + q12Ans6.getText() + q12Ans7.getText() + q12Ans8.getText() + q12Ans9.getText() + q12Ans10.getText() + q12Ans11.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq12.equalsIgnoreCase("controlunit")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));

            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=11; i++){

                q12Ans1.getScene().lookup("#q12Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q12Ans1.setText("");
            q12Ans3.setText("");
            q12Ans6.setText("");
            q12Ans9.setText("");
            q12Ans10.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=11; i++){

                        q12Ans1.getScene().lookup("#q12Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q13Ans1,q13Ans2,q13Ans3,q13Ans4,q13Ans5,q13Ans6,q13Ans7,q13Ans8,q13Ans9;

    @FXML
    void question13(ActionEvent event) throws IOException {

        String answerq13 =q13Ans1.getText() + q13Ans2.getText() + q13Ans3.getText() + q13Ans4.getText() + q13Ans5.getText() + q13Ans6.getText() + q13Ans7.getText() + q13Ans8.getText() + q13Ans9.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq13.equalsIgnoreCase("networkos")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                        
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=9; i++){

                q13Ans1.getScene().lookup("#q13Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q13Ans1.setText("");
            q13Ans3.setText("");
            q13Ans4.setText("");
            q13Ans7.setText("");
            q13Ans8.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=9; i++){

                        q13Ans1.getScene().lookup("#q13Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q14Ans1,q14Ans2,q14Ans3,q14Ans4,q14Ans5,q14Ans6,q14Ans7,q14Ans8,q14Ans9,q14Ans10,q14Ans11,q14Ans12,q14Ans13,q14Ans14,q14Ans15,q14Ans16,q14Ans17,q14Ans18,q14Ans19;

    @FXML
    void question14(ActionEvent event) throws IOException {

        String answerq14 = q14Ans1.getText() + q14Ans2.getText() + q14Ans3.getText() + q14Ans4.getText() + q14Ans5.getText() + q14Ans6.getText() + q14Ans7.getText() + q14Ans8.getText() + q14Ans9.getText() + q14Ans10.getText() + q14Ans11.getText() + q14Ans12.getText() + q14Ans13.getText() + q14Ans14.getText() + q14Ans15.getText() + q14Ans16.getText() + q14Ans17.getText() + q14Ans18.getText() + q14Ans19.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq14.equalsIgnoreCase("processormanagement")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                        
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;

        }
        else {
            for (int i= 1; i<=19; i++){

                q14Ans1.getScene().lookup("#q14Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q14Ans3.setText("");
            q14Ans4.setText("");
            q14Ans6.setText("");
            q14Ans7.setText("");
            q14Ans3.setText("");
            q14Ans3.setText("");
            q14Ans3.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=19; i++){

                        q14Ans1.getScene().lookup("#q14Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q15Ans1,q15Ans2,q15Ans3,q15Ans4,q15Ans5,q15Ans6,q15Ans7,q15Ans8,q15Ans9,q15Ans10,q15Ans11,q15Ans12,q15Ans13;

    @FXML
    void question15(ActionEvent event) throws IOException {

        String answerq15 = q15Ans1.getText() + q15Ans2.getText() + q15Ans3.getText() + q15Ans4.getText() + q15Ans5.getText() + q15Ans6.getText() + q15Ans7.getText() + q15Ans8.getText() + q15Ans9.getText() + q15Ans10.getText() + q15Ans11.getText() + q15Ans12.getText() + q15Ans13.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq15.equalsIgnoreCase("jobscheduling")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                                    
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=13; i++){

                q15Ans1.getScene().lookup("#q15Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q15Ans1.setText("");
            q15Ans3.setText("");
            q15Ans6.setText("");
            q15Ans9.setText("");
            q15Ans12.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=13; i++){

                        q15Ans1.getScene().lookup("#q15Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q16Ans1,q16Ans2,q16Ans3,q16Ans4,q16Ans5,q16Ans6,q16Ans7,q16Ans8;

    @FXML
    void question16(ActionEvent event) throws IOException {

        String answerq16 = q16Ans1.getText() + q16Ans2.getText() + q16Ans3.getText() + q16Ans4.getText() + q16Ans5.getText() + q16Ans6.getText() + q16Ans7.getText() + q16Ans8.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq16.equalsIgnoreCase("computer")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                                    
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=8; i++){

                q16Ans1.getScene().lookup("#q16Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q16Ans1.setText("");
            q16Ans3.setText("");
            q16Ans6.setText("");
            q16Ans8.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=8; i++){

                        q16Ans1.getScene().lookup("#q16Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q17Ans1,q17Ans2,q17Ans3,q17Ans4,q17Ans5,q17Ans6,q17Ans7,q17Ans8;

    @FXML
    void question17(ActionEvent event) throws IOException {
        String answerq17 = q17Ans1.getText() + q17Ans2.getText() + q17Ans3.getText() + q17Ans4.getText() + q17Ans5.getText() + q17Ans6.getText() + q17Ans7.getText() + q17Ans8.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq17.equalsIgnoreCase("function")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                                    
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=8; i++){

                q17Ans1.getScene().lookup("#q17Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q17Ans1.setText("");
            q17Ans4.setText("");
            q17Ans5.setText("");
            q17Ans7.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=8; i++){

                        q17Ans1.getScene().lookup("#q17Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q18Ans1,q18Ans2,q18Ans3,q18Ans4,q18Ans5,q18Ans6,q18Ans7,q18Ans8,q18Ans9,q18Ans10;

    @FXML
    void question18(ActionEvent event) throws IOException {
        String answerq18 = q18Ans1.getText() + q18Ans2.getText() + q18Ans3.getText() + q18Ans4.getText() + q18Ans5.getText() + q18Ans6.getText() + q18Ans7.getText() + q18Ans8.getText() + q18Ans9.getText() + q18Ans10.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq18.equalsIgnoreCase("googledocs")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                                    
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=10; i++){

                q18Ans1.getScene().lookup("#q18Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q18Ans2.setText("");
            q18Ans3.setText("");
            q18Ans4.setText("");
            q18Ans2.setText("");
            q18Ans2.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=10; i++){

                        q18Ans1.getScene().lookup("#q18Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q19Ans1,q19Ans2,q19Ans3,q19Ans4,q19Ans5,q19Ans6,q19Ans7,q19Ans8,q19Ans9;

    @FXML
    void question19(ActionEvent event) throws IOException {

        String answerq19 = q19Ans1.getText() + q19Ans2.getText() + q19Ans3.getText() + q19Ans4.getText() + q19Ans5.getText() + q19Ans6.getText() + q19Ans7.getText() + q19Ans8.getText() + q19Ans9.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq19.equalsIgnoreCase("shareadoc")) {
            
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                                    
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=9; i++){

                q19Ans1.getScene().lookup("#q19Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q19Ans1.setText("");
            q19Ans4.setText("");
            q19Ans5.setText("");
            q19Ans6.setText("");
            q19Ans8.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=9; i++){

                        q19Ans1.getScene().lookup("#q19Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);
            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

    @FXML private TextField q20Ans1,q20Ans2,q20Ans3,q20Ans4,q20Ans5,q20Ans6,q20Ans7,q20Ans8,q20Ans9,q20Ans10,q20Ans11,q20Ans12,q20Ans13;

    @FXML
    void question20(ActionEvent event) throws IOException {
        String answerq20 = q20Ans1.getText() + q20Ans2.getText() + q20Ans3.getText() + q20Ans4.getText() + q20Ans5.getText() + q20Ans6.getText() + q20Ans7.getText() + q20Ans8.getText() + q20Ans9.getText() + q20Ans10.getText() + q20Ans11.getText() + q20Ans12.getText() + q20Ans13.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq20.equalsIgnoreCase("manageaccount")) {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("ezquestions/q"+questionn+".fxml"));
                                    
            player.level = questionn;
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=13; i++){

                q20Ans1.getScene().lookup("#q20Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q20Ans2.setText("");
            q20Ans3.setText("");
            q20Ans6.setText("");
            q20Ans8.setText("");
            q20Ans11.setText("");
            q20Ans13.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=13; i++){

                        q20Ans1.getScene().lookup("#q20Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
            };

            time.schedule(task, 2000);

            player.lives = player.lives - 1;
            if (player.lives== 0) {
                loose(event);
            }
        }
    }

}
