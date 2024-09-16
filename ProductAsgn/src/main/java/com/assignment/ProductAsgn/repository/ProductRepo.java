package com.assignment.ProductAsgn.repository;

import com.assignment.ProductAsgn.model.Product;
import com.assignment.ProductAsgn.response.ProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    @Query(nativeQuery = true, value="select product_name, CAST((Aquisition_Cost-(Aquisition_Cost*Discount)/100) AS double) as price from products order BY product_name;")
    public List<Object []> findProducts();


}
