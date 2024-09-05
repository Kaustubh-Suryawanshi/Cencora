package com.pack.myexample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productID")
    private int prid;

    @Column(name="pName")
    private String prname;

    @Column(name="price")
    private double price;
    public Product()
    {

    }

    public Product(String prname, double price) {
        super();
        this.prname = prname;
        this.price = price;
    }
    public int getPrid() {
        return prid;
    }
    public void setPrid(int prid) {
        this.prid = prid;
    }
    public String getPrname() {
        return prname;
    }
    public void setPrname(String prname) {
        this.prname = prname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [prid=" + prid + ", prname=" + prname + ", price=" + price + "]";
    }



}
