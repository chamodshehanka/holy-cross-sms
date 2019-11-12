package com.rabbit.hollycross.view.controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/9/2019
 * @project StudentManagementSystem
 **/
public class ManageStudentScreenController implements Initializable {

    @FXML
    private AnchorPane rootManageStudent;

    @FXML
    private JFXTextField txtStudentID;

    @FXML
    private JFXTextField txtStudentName;

    @FXML
    private JFXTextField txtStudentNIC;

    @FXML
    private JFXTextField txtStudentAddress;

    @FXML
    private JFXDatePicker txtAdmissionDate;

    @FXML
    private JFXTextField txtStudentTelephone;

    @FXML
    private JFXTextField txtStudentIllness;

    @FXML
    private JFXTextField txtStudentGradeID;

    @FXML
    private JFXTextField txtStudentClassRoomID;

    @FXML
    private JFXTextField txtStudentExamID;

    @FXML
    private JFXTextField txtStudentHallID;

    @FXML
    private JFXTextField txtStudentHostelID;

    @FXML
    private JFXTextField txtParentID;

    @FXML
    private JFXTextField txtParentName;

    @FXML
    private JFXTextField txtParentAddress;

    @FXML
    private JFXTextField txtParentTelephone;

    @FXML
    private JFXTextField txtParentIOccupation;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void addStudent(ActionEvent event) {

    }

    @FXML
    void deleteStudent(ActionEvent event) {

    }

    @FXML
    void searchStudent(ActionEvent event) {

    }

    @FXML
    void updateStudent(ActionEvent event) {

    }

    @FXML
    void viewAllStudents(ActionEvent event) {
        try {
            AnchorPane allStudentsPane = FXMLLoader
                    .load(getClass().getResource("/com/rabbit/hollycross/view/fxml/ViewAllStudentsScreen.fxml"));
            rootManageStudent.getChildren().setAll(allStudentsPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
