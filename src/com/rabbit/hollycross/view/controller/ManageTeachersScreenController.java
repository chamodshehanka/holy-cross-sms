package com.rabbit.hollycross.view.controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/7/2019
 * @project StudentManagementSystem
 **/
public class ManageTeachersScreenController implements Initializable {

    @FXML
    private AnchorPane rootManageTeachers;

    @FXML
    private JFXTextField txtTeacherID;

    @FXML
    private JFXTextField txtTeacherName;

    @FXML
    private JFXTextField txtTeacherNIC;

    @FXML
    private JFXDatePicker txtAppointedDate;

    @FXML
    private JFXTextField txtTeacherQualification;

    @FXML
    private JFXTextField txtTeacherExeperience;

    @FXML
    private JFXTextField txtTeacherSectionID;

    @FXML
    private JFXTextField txtTeacherClassRoomID;

    @FXML
    private JFXTextField txtTeacherECAID;

    @FXML
    private JFXTextField txtTeacherIDCCAID;

    @FXML
    private JFXTextField txtTeacherAttendanceID;

    @FXML
    private JFXTextField txtTeacherReliefID;

    @FXML
    private JFXTextField txtTeacherHallID;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    void addTeacher() {

    }

    @FXML
    void allocateRelieves() {

    }

    @FXML
    void deleteTeacher() {

    }

    @FXML
    void searchTeacher() {

    }

    @FXML
    void updateTeacher() {

    }
}
