package com.example.newewew;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class SceneController  {
    @FXML
    private Stage stage;


    public void switchToScene1(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("scene1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void switchToScene2(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("scene2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene3(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("andeoid.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene4(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("frontend.fxml"));


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene5(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("cyber.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene6(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("ai.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene7(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("ios.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}