package com.rabbit.hollycross.view.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/22/2019
 * @project StudentManagementSystem
 **/
public class ViewMoreScreenController implements Initializable {


    @FXML
    private AnchorPane rootViewMore;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void viewManageSubjects() {
        try {
            AnchorPane pane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ManageSubjectsScreen.fxml"));
            rootViewMore.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void viewAchievement() {

    }

    @FXML
    void viewActivities() {

    }

    @FXML
    void viewClasses() {

    }

    @FXML
        // To remove
    void viewGrades() {
    }

    @FXML
    void viewManageGrades() {
        AnchorPane pane = null;


        try {
            pane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ManageGradesScreen.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        rootViewMore.getChildren().setAll(pane);
    }

    @FXML
    void viewSections() {

    }

    @FXML
    void viewSubjects() {

    }

}
