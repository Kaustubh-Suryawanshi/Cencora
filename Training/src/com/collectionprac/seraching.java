package com.collectionprac;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class seraching {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("Apple","Banana","Cherry","Pineapple", "water");
        int index= Collections.binarySearch(ls,"water");
        System.out.println(index);
    }
}
