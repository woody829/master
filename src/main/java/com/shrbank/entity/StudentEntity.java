package com.shrbank.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by woody on 2017/9/8.
 */
public class StudentEntity implements Serializable {
    private ClassEntity classEntity;
    private Date studentBirthday;
    private String studentID;
    private String studentName;
    private String studentSex;

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
}
