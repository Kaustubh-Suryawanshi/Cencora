package com.Java8pracs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Swami","Kaustubh","Pratham","Tanaya","Shreya");
        Consumer<String> printName= name -> System.out.println(name);

        names.forEach(printName);
        //or
        System.out.println("By methdo reference");
        names.forEach(System.out::println);
    }
}
