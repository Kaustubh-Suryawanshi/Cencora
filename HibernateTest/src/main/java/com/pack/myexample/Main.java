package com.pack.myexample;

import com.pack.myexample.dao.ProductDao;
import com.pack.myexample.model.Product;

public class Main {
    public static void main(String[] args) {
        Product p= new Product("shirt",200);
        ProductDao pd= new ProductDao();

        pd.ProductSave(p);
        for(Product p2: pd.getProducts()){
            System.out.println(p2);
        }
        p.setPrname("tshirt");
        pd.updateproducts(p);
        for(Product p2: pd.getProducts()){
            System.out.println(p2);
        }

        pd.deleteCustomer(3);
        for(Product p2: pd.getProducts()){
            System.out.println(p2);
        }


//        System.out.println(p);
    }
}