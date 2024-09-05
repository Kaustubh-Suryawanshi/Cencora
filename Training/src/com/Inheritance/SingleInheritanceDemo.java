package com.Inheritance;

class Base{
    int v1;
    String name;
    public Base()
    {
        System.out.println("com.Inheritance.Base Constructor");
    }
    public Base(int v,String sname)
    {
        v1=v;
        name=sname;
    }

    public void baseMethod()
    {
        System.out.println("BAse method");
        System.out.println("V1 from base = "+v1+" name from base: "+name);
    }
}

class Child extends Base{
    public Child()
    {
        System.out.println("child constructor");
    }
    public Child(int v,String sname){
        super(v,sname);
    }

    public void baseMethod()
    {
        System.out.println("base method of child");
        System.out.println("V1 from child = "+super.v1+" name from child: "+super.name);
    }

    public void childMethod(){
        System.out.println("child Method");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Base bobj= new Base(1,"Kaustubh");
        bobj.baseMethod();
        Child cobj= new Child(2,"Suryawanshi");
        cobj.baseMethod();
        cobj.childMethod();

    }
}

