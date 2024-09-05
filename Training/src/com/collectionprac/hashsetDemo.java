package com.collectionprac;

import java.util.*;

public class hashsetDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> hs;

        list.add(1);
        list.add(1);list.add(3);
        list.add(1);list.add(5);
        System.out.println(list);
        hs=new HashSet<>(list);
        System.out.println(hs);



    }
}
