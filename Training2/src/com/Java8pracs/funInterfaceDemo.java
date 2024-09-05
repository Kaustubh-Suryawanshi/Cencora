package com.Java8pracs;

import javax.xml.transform.Source;
@FunctionalInterface
interface MathOperation{
    int operation(int a,int b);
}

public class funInterfaceDemo {
    public static void main(String[] args) {
        MathOperation add=(a,b)-> a+b;
        MathOperation mul=(a,b)-> a*b;
        System.out.println("add: "+ add.operation(5,3));
        System.out.println("add: "+ mul.operation(5,3));;
    }
}
