package com.example.test7.dataModels;

public class Student {
    private String studentName;
    private String studentID;
    private String studentCourse;

    public Student(){
        //empty constructor
    }

    public Student(String name, String id, String course){
        this.studentName = name;
        this.studentID = id;
        this.studentCourse = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }
}