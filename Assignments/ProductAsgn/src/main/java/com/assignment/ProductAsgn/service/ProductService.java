package com.assignment.ProductAsgn.service;

import com.assignment.ProductAsgn.model.Product;
import com.assignment.ProductAsgn.repository.ProductRepo;
import com.assignment.ProductAsgn.response.ProductResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProductResponse> findProds(){
        System.out.println("starting...");
        List<Object[]> products= productRepo.findProducts();

        List<ProductResponse> productResponse=new ArrayList<>();

//        System.out.println("after Starting");
        for(Object[] it:products) {
            String product_name=(String) it[0];
            double price=(double) it[1];
            ProductResponse p=new ProductResponse(product_name,price);
            productResponse.add(p);
        }
        System.out.println("At the end of Service");
        return productResponse;
    }
}
