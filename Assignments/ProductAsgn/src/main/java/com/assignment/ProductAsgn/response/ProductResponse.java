package com.assignment.ProductAsgn.response;

public class ProductResponse {

//    private int Product_Code;
    private String product_name;
    private double price;
//    private int Discount;

    public ProductResponse() {
    }

    public ProductResponse( String product_name, double price) {
//        Product_Code = product_Code;
        this.product_name = product_name;
        this.price = price;
//        Discount = discount;
    }

    @Override
    public String toString() {
        return
//                "Product_Code=" + Product_Code +
                ", product_name='" + product_name + '\'' +
                ", Price='" + price + '\'';
    }
//    public int getProduct_Code() {
//        return Product_Code;
//    }
//
//    public void setProduct_Code(int product_Code) {
//        Product_Code = product_Code;
//    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getAquisition_Cost() {
        return price;
    }

    public void setAquisition_Cost(long aquisition_Cost) {
        price = aquisition_Cost;
    }

//    public int getDiscount() {
//        return Discount;
//    }
//
//    public void setDiscount(int discount) {
//        Discount = discount;
//    }
}

