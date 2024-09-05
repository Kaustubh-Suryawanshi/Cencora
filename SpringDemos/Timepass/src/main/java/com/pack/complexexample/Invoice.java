package com.pack.complexexample;

public class Invoice {
    private Product p;

    public Invoice(Product p) {
        this.p = p;
    }

    public void get_item_details(){
        System.out.println(p.toString());
    }
}
