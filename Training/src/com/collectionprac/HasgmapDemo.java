package com.collectionprac;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasgmapDemo {
    public static void main(String[] args) {
        Map<Integer,String> mp= new HashMap<>();
        mp.put(2,"Delhi");
        mp.put(3,"nfwc");
        mp.put(1,"nfwojr");
        mp.put(4,"nfei");
        System.out.println(mp) ; //doesn't maintain insertion order.

        System.out.println(mp.keySet());  //it returns Set of keys;

        Set<String> vals= (Set<String>) mp.values(); //since it returns Collection type
        System.out.println(mp.values());
        Set<Map.Entry<Integer,String>> entries= mp.entrySet();
        System.out.println(entries);  //it returns set of mappings in te given map;



    }
}
