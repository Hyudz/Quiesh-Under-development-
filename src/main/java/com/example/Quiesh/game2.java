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


public class game2 extends player{

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

    @FXML Label questionNo;

    @FXML private TextField q1Ans1,q1Ans2,q1Ans3,q1Ans4,q1Ans5,q1Ans6,q1Ans7,q1Ans8;

    @FXML
    void question1(ActionEvent event) throws IOException {

        System.out.println(player.round);
        String answerq1 = q1Ans1.getText() + q1Ans2.getText() + q1Ans3.getText() + q1Ans4.getText() + q1Ans5.getText() + q1Ans6.getText() + q1Ans7.getText() + q1Ans8.getText();
        if (player.round == 10) {
            win(event);
        }
        else if (answerq1.equalsIgnoreCase("hardware")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            player.round++;
        } else {
            player.lives = player.lives - 1;
            System.out.println(player.lives);

            for (int i= 1; i<=8; i++){

                q1Ans1.getScene().lookup("#q1Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");
                
            }

            q1Ans2.setText("");
            q1Ans3.setText("");
            q1Ans4.setText("");
            q1Ans5.setText("");
            q1Ans6.setText("");
            q1Ans7.setText("");


            if (player.lives == 0) {
                loose(event);
            }

            Timer time = new Timer();
            TimerTask task = new TimerTask() {

                @Override
                public void run() {
                    for (int i= 1; i<=8; i++){

                        q1Ans1.getScene().lookup("#q1Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
                    }
                }
                
            };

            time.schedule(task, 2000);
        }

    }

    @FXML private TextField q2Ans1,q2Ans2,q2Ans3,q2Ans4,q2Ans5,q2Ans6,q2Ans7,q2Ans8;

    @FXML
    void question2(ActionEvent event) throws IOException {

        String answerq2 = q2Ans1.getText() + q2Ans2.getText() + q2Ans3.getText() + q2Ans4.getText() + q2Ans5.getText() + q2Ans6 .getText() +q2Ans7.getText() + q2Ans8.getText();
        System.out.println(player.lives);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq2.equalsIgnoreCase("software")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=8; i++){

                q2Ans1.getScene().lookup("#q2Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q2Ans2.setText("");
            q2Ans3.setText("");
            q2Ans4.setText("");
            q2Ans5.setText("");
            q2Ans6.setText("");
            q2Ans7.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=8; i++){

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

    @FXML private TextField q3Ans1,q3Ans2,q3Ans3,q3Ans4,q3Ans5,q3Ans6,q3Ans7,q3Ans8,q3Ans9,q3Ans10,q3Ans11,q3Ans12,q3Ans13,q3Ans14,q3Ans15,q3Ans16,q3Ans17,q3Ans18,q3Ans19,q3Ans20,q3Ans21;

    @FXML
    void question3(ActionEvent event) throws IOException {

        String answerq3 = q3Ans1.getText() + q3Ans2.getText() + q3Ans3.getText() + q3Ans4.getText() + q3Ans5.getText() + q3Ans6.getText() + q3Ans7.getText() + q3Ans8.getText() + q3Ans9.getText() + q3Ans10.getText() + q3Ans11.getText() + q3Ans12.getText() + q3Ans13.getText() + q3Ans14.getText() + q3Ans15.getText() + q3Ans16.getText() + q3Ans17.getText() + q3Ans18.getText() + q3Ans19.getText() + q3Ans20.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq3.equalsIgnoreCase("computerarchitecture")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=20; i++){

                q3Ans1.getScene().lookup("#q3Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q3Ans2.setText("");
            q3Ans3.setText("");
            q3Ans4.setText("");
            q3Ans5.setText("");
            q3Ans6.setText("");
            q3Ans7.setText("");
            q3Ans10.setText("");
            q3Ans11.setText("");
            q3Ans12.setText("");
            q3Ans13.setText("");
            q3Ans14.setText("");
            q3Ans15.setText("");
            q3Ans16.setText("");
            q3Ans17.setText("");
            q3Ans18.setText("");
            q3Ans19.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=20; i++){

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

    @FXML private TextField q4Ans1,q4Ans2,q4Ans3,q4Ans4;

    @FXML
    void question4(ActionEvent event) throws IOException {
        String answerq4 = q4Ans1.getText() + q4Ans2.getText() + q4Ans3.getText() + q4Ans4.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq4.equalsIgnoreCase("cisc")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=4; i++){

                q4Ans1.getScene().lookup("#q4Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q4Ans2.setText("");
            q4Ans3.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=4; i++){

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

    @FXML private TextField q5Ans1,q5Ans2,q5Ans3,q5Ans4;

    @FXML
    void question5(ActionEvent event) throws IOException {
        String answerq5 = q5Ans1.getText() + q5Ans2.getText() + q5Ans3.getText() + q5Ans4.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq5.equalsIgnoreCase("risc")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=4; i++){

                q5Ans1.getScene().lookup("#q5Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q5Ans2.setText("");
            q5Ans3.setText("");


            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=4; i++){

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

    @FXML private TextField q6Ans1,q6Ans2,q6Ans3,q6Ans4,q6Ans5,q6Ans6,q6Ans7,q6Ans8,q6Ans9,q6Ans10,q6Ans11,q6Ans12,q6Ans13,q6Ans14,q6Ans15,q6Ans16,q6Ans17,q6Ans18,q6Ans19,q6Ans20,q6Ans21,q6Ans22;

    @FXML
    void question6(ActionEvent event) throws IOException {
        String answerq6 =  q6Ans1.getText() + q6Ans2.getText() + q6Ans3.getText() + q6Ans4.getText() + q6Ans5.getText() + q6Ans6.getText() + q6Ans7.getText() + q6Ans8.getText() + q6Ans9.getText() + q6Ans10.getText() + q6Ans11.getText() + q6Ans12.getText() + q6Ans13.getText() + q6Ans14.getText() + q6Ans15.getText() + q6Ans16.getText() + q6Ans17.getText() + q6Ans18.getText() + q6Ans19.getText() + q6Ans20.getText() + q6Ans21.getText() + q6Ans22.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq6.equalsIgnoreCase("vonneunmanarchitecture")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;

        }

        else {

            for (int i= 1; i<=22; i++){

                q6Ans1.getScene().lookup("#q6Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q6Ans2.setText("");
            q6Ans3.setText("");
            q6Ans5.setText("");
            q6Ans6.setText("");
            q6Ans7.setText("");
            q6Ans8.setText("");
            q6Ans9.setText("");
            q6Ans12.setText("");
            q6Ans13.setText("");
            q6Ans14.setText("");
            q6Ans15.setText("");
            q6Ans16.setText("");
            q6Ans17.setText("");
            q6Ans18.setText("");
            q6Ans19.setText("");
            q6Ans20.setText("");
            q6Ans21.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=22; i++){

                        q6Ans1.getScene().lookup("#q6Ans" + i).setStyle("-fx-background-color: #ffffff; -fx-opacity: 1.0");
        
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

    @FXML private TextField q7Ans1,q7Ans2,q7Ans3,q7Ans4,q7Ans5,q7Ans6,q7Ans7,q7Ans8,q7Ans9,q7Ans10,q7Ans11,q7Ans12,q7Ans13,q7Ans14,q7Ans15,q7Ans16,q7Ans17,q7Ans18,q7Ans19;

    @FXML
    void question7(ActionEvent event) throws IOException {
        String answerq7 = q7Ans1.getText() + q7Ans2.getText() + q7Ans3.getText() + q7Ans4.getText() + q7Ans5.getText() + q7Ans6.getText() + q7Ans7.getText() + q7Ans8.getText() + q7Ans9.getText() + q7Ans10.getText() + q7Ans11.getText() + q7Ans12.getText() + q7Ans13.getText() + q7Ans14.getText() + q7Ans15.getText() + q7Ans16.getText() + q7Ans17.getText() + q7Ans18.getText() + q7Ans19.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq7.equalsIgnoreCase("harvardarchitecture")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;

        }
        else {
            for (int i= 1; i<=19; i++){

                q7Ans1.getScene().lookup("#q7Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q7Ans2.setText("");
            q7Ans3.setText("");
            q7Ans4.setText("");
            q7Ans5.setText("");
            q7Ans6.setText("");
            q7Ans9.setText("");
            q7Ans10.setText("");
            q7Ans11.setText("");
            q7Ans12.setText("");
            q7Ans13.setText("");
            q7Ans14.setText("");
            q7Ans15.setText("");
            q7Ans16.setText("");
            q7Ans17.setText("");
            q7Ans18.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=19; i++){

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

    @FXML private TextField q8Ans1,q8Ans2,q8Ans3,q8Ans4,q8Ans5,q8Ans6,q8Ans7,q8Ans8,q8Ans9,q8Ans10,q8Ans11,q8Ans12,q8Ans13,q8Ans14,q8Ans15,q8Ans16,q8Ans17,q8Ans18,q8Ans19,q8Ans20,q8Ans21,q8Ans22,q8Ans23,q8Ans24,q8Ans25,q8Ans26;

    @FXML
    void question8(ActionEvent event) throws IOException {
        String answerq8 = q8Ans1.getText() + q8Ans2.getText() + q8Ans3.getText() + q8Ans4.getText() + q8Ans5.getText() + q8Ans6.getText() + q8Ans7.getText() + q8Ans8.getText() + q8Ans9.getText() + q8Ans10.getText() + q8Ans11.getText() + q8Ans12.getText() + q8Ans13.getText() + q8Ans14.getText() + q8Ans15.getText() + q8Ans16.getText() + q8Ans17.getText() + q8Ans18.getText() + q8Ans19.getText() + q8Ans20.getText() + q8Ans21.getText() + q8Ans22.getText() + q8Ans23.getText() + q8Ans24.getText() + q8Ans25.getText()  + q8Ans26.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq8.equalsIgnoreCase("instructionsetarchitecture")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=26; i++){

                q8Ans1.getScene().lookup("#q8Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q8Ans2.setText("");
            q8Ans3.setText("");
            q8Ans4.setText("");
            q8Ans5.setText("");
            q8Ans6.setText("");
            q8Ans7.setText("");
            q8Ans8.setText("");
            q8Ans9.setText("");
            q8Ans10.setText("");
            q8Ans13.setText("");
            q8Ans14.setText("");
            q8Ans16.setText("");
            q8Ans17.setText("");
            q8Ans18.setText("");
            q8Ans19.setText("");
            q8Ans20.setText("");
            q8Ans21.setText("");
            q8Ans22.setText("");
            q8Ans23.setText("");
            q8Ans24.setText("");
            q8Ans25.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=26; i++){

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

    @FXML private TextField q9Ans1,q9Ans2,q9Ans3,q9Ans4,q9Ans5,q9Ans6,q9Ans7,q9Ans8,q9Ans9,q9Ans10,q9Ans11,q9Ans12,q9Ans13,q9Ans14,q9Ans15,q9Ans16,q9Ans17;

    @FXML
    void question9(ActionEvent event) throws IOException {
        String answerq9 = q9Ans1.getText() + q9Ans2.getText() + q9Ans3.getText() + q9Ans4.getText() + q9Ans5.getText() + q9Ans6.getText() + q9Ans7.getText() + q9Ans8.getText() + q9Ans9.getText() + q9Ans10.getText() + q9Ans11.getText() + q9Ans12.getText() + q9Ans13.getText() + q9Ans14.getText() + q9Ans15.getText() + q9Ans16.getText() + q9Ans17.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq9.equalsIgnoreCase("microarchitecture")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=17; i++){

                q9Ans1.getScene().lookup("#q9Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q9Ans2.setText("");
            q9Ans3.setText("");
            q9Ans4.setText("");
            q9Ans7.setText("");
            q9Ans8.setText("");
            q9Ans9.setText("");
            q9Ans10.setText("");
            q9Ans11.setText("");
            q9Ans12.setText("");
            q9Ans13.setText("");
            q9Ans14.setText("");
            q9Ans15.setText("");
            q9Ans16.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=17; i++){

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

    @FXML private TextField q10Ans1,q10Ans2,q10Ans3,q10Ans4,q10Ans5,q10Ans6,q10Ans7,q10Ans8,q10Ans9,q10Ans10,q10Ans11,q10Ans12;

    @FXML
    void question10(ActionEvent event) throws IOException {
        String answerq10 = q10Ans1.getText() + q10Ans2.getText() + q10Ans3.getText() + q10Ans4.getText() + q10Ans5.getText() + q10Ans6.getText() + q10Ans7.getText() + q10Ans8.getText() + q10Ans9.getText() + q10Ans10.getText() + q10Ans11.getText() + q10Ans12.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq10.equalsIgnoreCase("systemdesign")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=12; i++){

                q10Ans1.getScene().lookup("#q10Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q10Ans2.setText("");
            q10Ans3.setText("");
            q10Ans4.setText("");
            q10Ans5.setText("");
            q10Ans8.setText("");
            q10Ans9.setText("");
            q10Ans10.setText("");
            q10Ans11.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=12; i++){

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

    @FXML private TextField q11Ans1,q11Ans2,q11Ans3,q11Ans4,q11Ans5,q11Ans6,q11Ans7,q11Ans8,q11Ans9,q11Ans10,q11Ans11,q11Ans12,q11Ans13,q11Ans14,q11Ans15,q11Ans16,q11Ans17;

    @FXML
    void question11(ActionEvent event) throws IOException {
        String answerq11 = q11Ans1.getText() + q11Ans2.getText() + q11Ans3.getText() + q11Ans4.getText() + q11Ans5.getText() + q11Ans6.getText() + q11Ans7.getText() + q11Ans8.getText() + q11Ans9.getText() + q11Ans10.getText() + q11Ans11.getText() + q11Ans12.getText() + q11Ans13.getText() + q11Ans14.getText() + q11Ans15.getText() + q11Ans16.getText() + q11Ans17.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq11.equalsIgnoreCase("kernellevelthread")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=17; i++){

                q11Ans1.getScene().lookup("#q11Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q11Ans2.setText("");
            q11Ans3.setText("");
            q11Ans4.setText("");
            q11Ans5.setText("");
            q11Ans8.setText("");
            q11Ans9.setText("");
            q11Ans10.setText("");
            q11Ans13.setText("");
            q11Ans14.setText("");
            q11Ans15.setText("");
            q11Ans16.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=17; i++){

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

    @FXML private TextField q12Ans1,q12Ans2,q12Ans3,q12Ans4;

    @FXML
    void question12(ActionEvent event) throws IOException {
        String answerq12 = q12Ans1.getText() + q12Ans2.getText() + q12Ans3.getText() + q12Ans4.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq12.equalsIgnoreCase("unix")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=4; i++){

                q12Ans1.getScene().lookup("#q12Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q12Ans2.setText("");
            q12Ans3.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=4; i++){

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

    @FXML private TextField q13Ans1,q13Ans2,q13Ans3,q13Ans4,q13Ans5,q13Ans6,q13Ans7,q13Ans8;

    @FXML
    void question13(ActionEvent event) throws IOException {
        String answerq13 =q13Ans1.getText() + q13Ans2.getText() + q13Ans3.getText() + q13Ans4.getText() + q13Ans5.getText() + q13Ans6.getText() + q13Ans7.getText() + q13Ans8.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq13.equalsIgnoreCase("appledos")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=8; i++){

                q13Ans1.getScene().lookup("#q13Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q13Ans2.setText("");
            q13Ans3.setText("");
            q13Ans4.setText("");
            q13Ans7.setText("");
            q13Ans8.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=8; i++){

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

    @FXML private TextField q14Ans1,q14Ans2,q14Ans3,q14Ans4,q14Ans5;

    @FXML
    void question14(ActionEvent event) throws IOException {
        String answerq14 = q14Ans1.getText() + q14Ans2.getText() + q14Ans3.getText() + q14Ans4.getText() + q14Ans5.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq14.equalsIgnoreCase("msdos")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;

        }
        else {
            for (int i= 1; i<=5; i++){

                q14Ans1.getScene().lookup("#q14Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q14Ans2.setText("");
            q14Ans4.setText("");
            q14Ans5.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=5; i++){

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

    @FXML private TextField q15Ans1,q15Ans2,q15Ans3,q15Ans4,q15Ans5,q15Ans6,q15Ans7,q15Ans8,q15Ans9,q15Ans10,q15Ans11,q15Ans12,q15Ans13,q15Ans14,q15Ans15,q15Ans16;

    @FXML
    void question15(ActionEvent event) throws IOException {
        String answerq15 = q15Ans1.getText() + q15Ans2.getText() + q15Ans3.getText() + q15Ans4.getText() + q15Ans5.getText() + q15Ans6.getText() + q15Ans7.getText() + q15Ans8.getText() + q15Ans9.getText() + q15Ans10.getText() + q15Ans11.getText() + q15Ans12.getText() + q15Ans13.getText() + q15Ans14.getText() + q15Ans15.getText() + q15Ans16.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq15.equalsIgnoreCase("microsoftwindows")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=16; i++){

                q15Ans1.getScene().lookup("#q15Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q15Ans2.setText("");
            q15Ans3.setText("");
            q15Ans4.setText("");
            q15Ans5.setText("");
            q15Ans6.setText("");
            q15Ans7.setText("");
            q15Ans8.setText("");
            q15Ans11.setText("");
            q15Ans12.setText("");
            q15Ans13.setText("");
            q15Ans14.setText("");
            q15Ans15.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=16; i++){

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

    @FXML private TextField q16Ans1,q16Ans2,q16Ans3,q16Ans4,q16Ans5;

    @FXML
    void question16(ActionEvent event) throws IOException {
        String answerq16 = q16Ans1.getText() + q16Ans2.getText() + q16Ans3.getText() + q16Ans4.getText() + q16Ans5.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq16.equalsIgnoreCase("shell")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=5; i++){

                q16Ans1.getScene().lookup("#q16Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q16Ans2.setText("");
            q16Ans3.setText("");
            q16Ans4.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=5; i++){

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

    @FXML private TextField q17Ans1,q17Ans2,q17Ans3,q17Ans4,q17Ans5,q17Ans6;

    @FXML
    void question17(ActionEvent event) throws IOException {
        String answerq17 = q17Ans1.getText() + q17Ans2.getText() + q17Ans3.getText() + q17Ans4.getText() + q17Ans5.getText() + q17Ans6.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq17.equalsIgnoreCase("kernel")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {

            for (int i= 1; i<=6; i++){

                q17Ans1.getScene().lookup("#q17Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q17Ans2.setText("");
            q17Ans3.setText("");
            q17Ans4.setText("");
            q17Ans5.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=6; i++){

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
        else if (answerq18.equalsIgnoreCase("realtimeos")) {

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
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
            q18Ans6.setText("");
            q18Ans7.setText("");
            q18Ans8.setText("");
            q18Ans9.setText("");


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

    @FXML private TextField q19Ans1,q19Ans2,q19Ans3,q19Ans4,q19Ans5,q19Ans6,q19Ans7,q19Ans8,q19Ans9,q19Ans10,q19Ans11,q19Ans12,q19Ans13,q19Ans14;

    @FXML
    void question19(ActionEvent event) throws IOException {
        String answerq19 = q19Ans1.getText() + q19Ans2.getText() + q19Ans3.getText() + q19Ans4.getText() + q19Ans5.getText() + q19Ans6.getText() + q19Ans7.getText() + q19Ans8.getText() + q19Ans9.getText() + q19Ans10.getText() + q19Ans11.getText() + q19Ans12.getText() + q19Ans13.getText() + q19Ans14.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq19.equalsIgnoreCase("hardrealtimeos")) {
            
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("challenging/q"+questionn+".fxml"));
            Parent root = loader1.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            player.round++;
        }
        else {
            for (int i= 1; i<=14; i++){

                q19Ans1.getScene().lookup("#q19Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q19Ans2.setText("");
            q19Ans3.setText("");
            q19Ans4.setText("");
            q19Ans6.setText("");
            q19Ans7.setText("");
            q19Ans8.setText("");
            q19Ans10.setText("");
            q19Ans11.setText("");
            q19Ans12.setText("");
            q19Ans13.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=14; i++){

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

    @FXML private TextField q20Ans1,q20Ans2,q20Ans3,q20Ans4,q20Ans5,q20Ans6,q20Ans7,q20Ans8,q20Ans9,q20Ans10,q20Ans11,q20Ans12,q20Ans13,q20Ans14;

    @FXML
    void question20(ActionEvent event) throws IOException {
        String answerq20 = q20Ans1.getText() + q20Ans2.getText() + q20Ans3.getText() + q20Ans4.getText() + q20Ans5.getText() + q20Ans6.getText() + q20Ans7.getText() + q20Ans8.getText() + q20Ans9.getText() + q20Ans10.getText() + q20Ans11.getText() + q20Ans12.getText() + q20Ans13.getText() + q20Ans14.getText();
        System.out.println(player.round);
        if (player.round == 10) {
            win(event);
        }
        else if (answerq20.equalsIgnoreCase("softrealtimeos")) {
            win(event);
        }
        else {

            for (int i= 1; i<=14; i++){

                q20Ans1.getScene().lookup("#q20Ans" + i).setStyle("-fx-background-color: #ffcccb; -fx-opacity: 1.0");

            }

            q20Ans2.setText("");
            q20Ans3.setText("");
            q20Ans4.setText("");
            q20Ans6.setText("");
            q20Ans7.setText("");
            q20Ans8.setText("");
            q20Ans10.setText("");
            q20Ans11.setText("");
            q20Ans12.setText("");
            q20Ans13.setText("");

            Timer  time = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    for (int i= 1; i<=14; i++){

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
