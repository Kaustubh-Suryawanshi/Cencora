package com.bankExample.microservicesDemo1_a.repository;


import com.bankExample.microservicesDemo1_a.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo  extends JpaRepository<Customer, Integer> {

}
