package com.Java8pracs;

import java.util.Comparator;

@FunctionalInterface
interface Addable{
    int add(int x,int y);
}
@FunctionalInterface
interface Incrementor{
    int increment(int x);
}
@FunctionalInterface
interface Printable{
    void print();
}

public class LamdaExpDemo {
    public static void main(String[] args) {
        Printable p=() -> System.out.println("Hello");
        p.print();

        Incrementor in= i -> ++i;
        System.out.println(in.increment(6));

        Addable add=(x,y) -> x+y;
        System.out.println(add.add(6,7));


    }
}
