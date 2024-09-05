package com.pack.LogPro.model;

public class User {
    private String name;
    private String uname;
    private int age;
    private String pass;
    private String gender;

    public User(String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
    }

    public User(String name, int age, String gender, String uname, String pass) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.uname = uname;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
