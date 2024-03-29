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

    private void loadPrincipalOverviewScreen() {
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
        try {
            AnchorPane buildingPane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ManageBuildingScreen.fxml"));
            rootPane.getChildren().setAll(buildingPane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void viewExams() {
        try {
            AnchorPane examsPane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ManageExamsScreen.fxml"));
            rootPane.getChildren().setAll(examsPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        try {
            AnchorPane studentPane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ManageStudentScreen.fxml"));
            rootPane.getChildren().setAll(studentPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    @FXML
    private void viewUsers() {
        try {
            AnchorPane usersPane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ManageUsersScreen.fxml"));
            rootPane.getChildren().setAll(usersPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewMore() {
        try {
            AnchorPane viewMorePane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ViewMoreScreen.fxml"));
            rootPane.getChildren().setAll(viewMorePane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
