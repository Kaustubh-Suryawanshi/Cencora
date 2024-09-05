package com.innerclasses;

class Outer{
    void outerMethod()
    {
        final int num  = 10;
        class LocalInner{
            void printnum(){
                System.out.println("num="+num);
            }
        }
        LocalInner  l=new LocalInner();
        l.printnum();
    }
}

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Outer o= new Outer();
        o.outerMethod();
    }
}
