package com.rabbit.hollycross.view.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/7/2019
 * @project StudentManagementSystem
 **/
public class PrincipalDashboardController implements Initializable {

    @FXML
    private AnchorPane rootPrincipalDashboard;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Text lblTeachers;

    @FXML
    private Text lblStudents;

    @FXML
    private Text lblBuildings;

    @FXML
    private Text lblExams;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        loadPrincipalOverviewScreen();

        // Have to change
        lblTeachers.setText("225");
        lblStudents.setText("2500");
        lblBuildings.setText("18");
        lblExams.setText("0");
    }

    private void loadPrincipalOverviewScreen(){
        try {
            AnchorPane anchorPane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/PrincipalOverviewScreen.fxml"));
            rootPane.getChildren().setAll(anchorPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void logOut() {
        AnchorPane loginPane;
        try {
            loginPane = FXMLLoader.load(getClass().getResource(
                    "/com/rabbit/hollycross/view/fxml/LoginScreen.fxml"
            ));
            rootPrincipalDashboard.getChildren().setAll(loginPane);
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
        try {
            AnchorPane homePane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/PrincipalOverviewScreen.fxml"));
            rootPane.getChildren().setAll(homePane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewStudents() {

    }

    @FXML
    private void viewTeachers() {
        try {
            AnchorPane teachersPane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ManageTeachersScreen.fxml"));
            rootPane.getChildren().setAll(teachersPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
