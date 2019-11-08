package com.rabbit.hollycross.view.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/9/2019
 * @project StudentManagementSystem
 **/
public class PrincipalOverviewScreenController implements Initializable {

    @FXML
    public AnchorPane rootPane;

    @FXML
    public Text lblTeachers;

    @FXML
    public Text lblStudents;

    @FXML
    public Text lblBuildings;

    @FXML
    public Text lblExams;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Have to change
        lblTeachers.setText("22");
        lblStudents.setText("250");
        lblBuildings.setText("18");
        lblExams.setText("0");
    }
}
