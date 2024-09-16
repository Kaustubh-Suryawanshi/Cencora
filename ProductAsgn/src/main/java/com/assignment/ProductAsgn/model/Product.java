package com.assignment.ProductAsgn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Product_Code")
    private int Product_Code;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "Aquisition_Cost")
    private int Aquisition_Cost;
    @Column(name = "Discount")
    private int Discount;

    public Product() {
    }

    public Product(int product_Code, String product_name, int aquisition_Cost, int discount) {
        Product_Code = product_Code;
        this.product_name = product_name;
        Aquisition_Cost = aquisition_Cost;
        Discount = discount;
    }

    public int getProduct_Code() {
        return Product_Code;
    }

    public void setProduct_Code(int product_Code) {
        Product_Code = product_Code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getAquisition_Cost() {
        return Aquisition_Cost;
    }

    public void setAquisition_Cost(int aquisition_Cost) {
        Aquisition_Cost = aquisition_Cost;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }
}
