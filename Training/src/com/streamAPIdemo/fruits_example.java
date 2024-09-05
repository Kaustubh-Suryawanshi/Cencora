package com.streamAPIdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class fruits_example {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("Apple","Banana","Cherry","Pineapple", "water");
        List<String> sortedFruits= ls.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedFruits);

        Comparator<String > com= Comparator.comparingInt(String::length);
        int in= Collections.binarySearch(ls,"Banana",com); //it will return the first index which matches the length of Banana i.e. 6
        System.out.println(in);

    }
}
