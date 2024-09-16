package com.assignment.ProductAsgn.controller;

import com.assignment.ProductAsgn.response.ProductResponse;
import com.assignment.ProductAsgn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/")
    public String func()
    {
        List<ProductResponse> productResponse=productService.findProds();
        String res="";
        for(ProductResponse it:productResponse){
            res+=it.toString();
            res+="\n";
        }
        return res;
    }
}
