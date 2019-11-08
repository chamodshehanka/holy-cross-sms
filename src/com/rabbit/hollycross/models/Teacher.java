package com.rabbit.hollycross.models;

/**
 * @author chamodshehanka on 11/3/2019
 * @project StudentManagementSystem
 **/
public class Teacher {
    private String teacherId;
    private String teacherName;
    private String nic;
    private String appointedDate;
    private String qualification;
    private String exeperiece;
    private String sectionId;
    private String classRoomId;
    private String ecaId;
    private String ccaId;
    private String attendanceId;
    private String reliefId;
    private String hallId;

    public Teacher(String teacherId, String teacherName, String nic, String appointedDate, String qualification, String exeperiece, String sectionId, String classRoomId, String ecaId, String ccaId, String attendanceId, String reliefId, String hallId) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.nic = nic;
        this.appointedDate = appointedDate;
        this.qualification = qualification;
        this.exeperiece = exeperiece;
        this.sectionId = sectionId;
        this.classRoomId = classRoomId;
        this.ecaId = ecaId;
        this.ccaId = ccaId;
        this.attendanceId = attendanceId;
        this.reliefId = reliefId;
        this.hallId = hallId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAppointedDate() {
        return appointedDate;
    }

    public void setAppointedDate(String appointedDate) {
        this.appointedDate = appointedDate;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExeperiece() {
        return exeperiece;
    }

    public void setExeperiece(String exeperiece) {
        this.exeperiece = exeperiece;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(String classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getEcaId() {
        return ecaId;
    }

    public void setEcaId(String ecaId) {
        this.ecaId = ecaId;
    }

    public String getCcaId() {
        return ccaId;
    }

    public void setCcaId(String ccaId) {
        this.ccaId = ccaId;
    }

    public String getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getReliefId() {
        return reliefId;
    }

    public void setReliefId(String reliefId) {
        this.reliefId = reliefId;
    }

    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }
}
