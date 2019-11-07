package com.rabbit.hollycross.view.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/3/2019
 * @project StudentManagementSystem
 **/
public class LoginScreenController implements Initializable {

    @FXML
    private AnchorPane rootLogin;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXPasswordField txtPassword;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void loginAction() {
        try {
            AnchorPane principalDashboardPane = FXMLLoader.load(getClass().getResource(
                    "/com/rabbit/hollycross/view/fxml/PrincipalDashboard.fxml"
            ));

            rootLogin.getChildren().setAll(principalDashboardPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
