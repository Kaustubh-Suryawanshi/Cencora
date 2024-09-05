package com.pack.myexample;

public class Student {
    private int sid;
    private String sname;
    private String scourse;

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setScourse(String scourse) {
        this.scourse = scourse;
    }

    public void display(){
        System.out.println("id= "+sid+" name= "+sname+" course= "+scourse);
    }
}
