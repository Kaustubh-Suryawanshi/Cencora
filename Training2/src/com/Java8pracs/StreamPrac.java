package com.Java8pracs;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPrac {
    public static void main(String[] args) {
        List<String> personName= new ArrayList<>();
        personName.add("Kaustubh");
        personName.add("Keshav");
        personName.add("Anmol");
        personName.add("Prachi");
        personName.add("Pratham");
        personName.add("Tanaya");
        personName.add("Soham");
        personName.add("Shri");
        personName.add("Chinmay");
        personName.add("Rachit");
        personName.add("Krishna");
        personName.add("Rachiy");

        // ------------Intermediate operations ------
        personName.stream().filter(s -> s.startsWith("K")).forEach(System.out::println);
        // /filterdata and convert
        personName.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
        personName.stream().filter(s -> s.startsWith("S")).sorted().forEach(System.out::println);


        // Terminal Operations
        List<String> personInUpperCase= personName.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(personInUpperCase);

        boolean matchResult= personName.stream().anyMatch(s-> s.startsWith("Z"));
        System.out.println(matchResult);

        matchResult= personName.stream().allMatch(s ->s.startsWith("A"));
        System.out.println(matchResult);

        matchResult= personName.stream().noneMatch(s -> s.startsWith("A"));
        System.out.println(matchResult);

        long totalMatch = personName.stream().filter(s-> s.startsWith("K")).count();
        System.out.println(totalMatch);

        Optional<String> reduced= personName.stream().reduce((s1,s2) -> s1+ " # "+s2);
        reduced.ifPresent(System.out::println);

        String firstMatch= personName.stream()
                .filter(s-> s.startsWith("T")).findFirst().get();
        System.out.println(firstMatch);





    }
}
