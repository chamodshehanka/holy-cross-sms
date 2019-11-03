package com.rabbit.hollycross.view.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/3/2019
 * @project StudentManagementSystem
 **/
public class LoginScreenController implements Initializable {

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXPasswordField txtPassword;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void loginAction() {}
}
