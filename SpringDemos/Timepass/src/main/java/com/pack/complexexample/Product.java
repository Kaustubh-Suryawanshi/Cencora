package com.pack.complexexample;

import java.security.PrivateKey;

public class Product {
    private int pid;
    private String pname;
    private double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
}
