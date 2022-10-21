package com.example.doancuoiky.model;

import java.util.Date;

public class Student {
    private String id;
    private String name;
    private Date dob;
    private int classId;

    public Student(String id, String name, Date dob, int classID) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.classId = classID;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getClassID() {
        return classId;
    }

    public void setClassID(int classID) {
        this.classId = classID;
    }
}
