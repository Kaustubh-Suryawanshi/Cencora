package com.pack.myexample;

public class ObjExample {
    int id;
    String name;
    public ObjExample() {
    }

    public ObjExample(int id) {
        this.id = id;
    }

    public ObjExample(String name) {
        this.name = name;
    }

    public ObjExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display()
    {
        System.out.println(id+" "+name);
    }
}
