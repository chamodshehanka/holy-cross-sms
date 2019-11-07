package com.rabbit.hollycross.view.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/7/2019
 * @project StudentManagementSystem
 **/
public class PrincipalDashboardController implements Initializable {

    @FXML
    private AnchorPane rootPricipalDashboard;

    @FXML
    private AnchorPane rootPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void logOut() {
        AnchorPane loginPane;
        try {
            loginPane = FXMLLoader.load(getClass().getResource(
                    "/com/rabbit/hollycross/view/fxml/LoginScreen.fxml"
            ));
            rootPricipalDashboard.getChildren().setAll(loginPane);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @FXML
    private void viewBuildings() {

    }

    @FXML
    private void viewExams() {

    }

    @FXML
    private void viewHome() {

    }

    @FXML
    private void viewStudents() {

    }

    @FXML
    private void viewTeachers() {

    }

}
