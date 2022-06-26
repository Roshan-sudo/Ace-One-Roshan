package com.ace.services.one.capital;

public class UserModel {
    private String userId, phone, name, course, institute;

    public UserModel() {
        // Required empty constructor
    }

    public UserModel(String userId, String phone, String name, String course, String institute) {
        this.userId = userId;
        this.phone = phone;
        this.name = name;
        this.course = course;
        this.institute = institute;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
}
