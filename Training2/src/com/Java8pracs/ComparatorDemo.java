package com.Java8pracs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
    int id;
    String name;
    double price;

    public Product(int id,String name, double price ) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Product> list= new ArrayList<>();
        list.add(new Product(14,"Shampoo",123.83));
        list.add(new Product(24,"Harpic",623.83));
        list.add(new Product(124,"Bag",13.83));
        list.add(new Product(4,"Toothpaste",187.83));
        list.add(new Product(35,"Sack",193.83));
        System.out.println("Sorted by name...");
        Comparator<Product> prnamecomp= Comparator.comparing(e-> e.name);
        Collections.sort(list,prnamecomp);
        list.forEach(e-> System.out.println(e));
        System.out.println("Sorted by price..");
        Comparator<Product> prpricecomp= Comparator.comparingDouble(e-> e.price);
        Collections.sort(list,prpricecomp);
        list.forEach(e-> System.out.println(e));
        System.out.println("Sorted by id..");
        Comparator<Product> pridcomp= Comparator.comparingInt(e-> e.id);
        Collections.sort(list,pridcomp);
        list.forEach(e-> System.out.println(e));


    }
}
