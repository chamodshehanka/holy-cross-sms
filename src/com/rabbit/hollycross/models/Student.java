package com.rabbit.hollycross.models;

/**
 * @author chamodshehanka on 11/3/2019
 * @project StudentManagementSystem
 **/
public class Student {
    private String studentId;
    private String studentName;
    private String nic;
    private String admissionDate;
    private String address;
    private String telephone;
    private String illness;
    private String parentId;
    private String gradeId;
    private String classRoomId;
    private String examId;
    private String hallId;
    private String hostelId;

    public Student(String studentId, String studentName, String nic, String admissionDate, String address, String telephone, String illness, String parentId, String gradeId, String classRoomId, String examId, String hallId, String hostelId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.nic = nic;
        this.admissionDate = admissionDate;
        this.address = address;
        this.telephone = telephone;
        this.illness = illness;
        this.parentId = parentId;
        this.gradeId = gradeId;
        this.classRoomId = classRoomId;
        this.examId = examId;
        this.hallId = hallId;
        this.hostelId = hostelId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(String classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    public String getHostelId() {
        return hostelId;
    }

    public void setHostelId(String hostelId) {
        this.hostelId = hostelId;
    }
}
