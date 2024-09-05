package com.Inheritance;

class A
{
    A(){
        System.out.println("in com.Inheritance.A");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("in com.Inheritance.B");
    }
}

class C extends B{
    C(){
        super();
        System.out.println("in com.Inheritance.C");
    }
}

public class multilevel {
    public static void main(String[] args) {
        C c=new C();
    }
}
