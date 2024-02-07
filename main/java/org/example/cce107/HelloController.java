package org.example.cce107;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label labelMessage;

    @FXML
    private Button loginBTN;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField user;

    @FXML
    private Label wrong;

    @FXML
    private Label taplak;

    @FXML
    public void loginBTN(ActionEvent event) {
        String username = "admin";
        String password = "admin123";

        taplak.setVisible(true);
        wrong.setVisible(false);

        Alert alert;

       if (username.equals(user.getText()) && password.equals(pass.getText())) {

           loginBTN.getScene().getWindow().hide();
           Parent root = null;
           try {
               root = FXMLLoader.load(getClass().getResource("DENTAL.fxml"));
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
           Stage stage = new Stage();
           Scene scene = new Scene(root);

           stage.setScene(scene);
           stage.show();

        } else if (username.equals(user.getText().isEmpty()) || password.equals(pass.getText().isEmpty())) {
            wrong.setVisible(false);


       } else {
           wrong.setVisible(true);
           taplak.setVisible(false);
       }
    }

}