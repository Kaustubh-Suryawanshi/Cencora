package com.Java8pracs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;

public class PredicateProduct {
    public static void main(String[] args) {
        List<Product>  list= new ArrayList<>();
        list.add(new Product(14,"Shampoo",123.83));
        list.add(new Product(24,"Harpic",623.83));
        list.add(new Product(124,"Bag",13.83));
        list.add(new Product(4,"Toothpaste",187.83));
        list.add(new Product(35,"Sack",193.83));

        Predicate<Product> pr= p-> p.id >67;
        list.stream().filter(pr).forEach(System.out::println);

        Predicate<Product> pr2= p->p.price >200;
        list.stream().filter(pr2).forEach(System.out::println);

        DoublePredicate dp = a-> {
            if(a>14.0) return true;
            else return false;
        };      //DoublepRedicate is introduced to deal with doubke values.

        System.out.println(dp.test(13.698));
        System.out.println(dp.test(15.897));

    }
}
