package com.prac.JpaTestConn.service;




import com.prac.JpaTestConn.entities.Customer;
import com.prac.JpaTestConn.repository.CustomerRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)

class CustomerServiceTest {

    @Mock
    private CustomerRepo customerRepo;
    //When using Mockito Use @InjectMocks to inject
    //Mocked beans to following class

    @InjectMocks
    private CustomerService customerService;

    @Test
    void getAllCustomer() {

        //given
        Customer customer1=new Customer(1,"Saving Account","Chintan Lavri");
        Customer customer2=new Customer(2,"Current Account","Parth Darji");
        //when
        given(customerRepo.findAll())
                .willReturn(List.of(customer1,customer2));
        var customerList=customerService.getAllCustomer();
        //Then
        //Make sure you will import assertThat From org.assertj.core.api package
        assertThat(customerList).isNotNull();
        assertThat(customerList.size()).isEqualTo(2);

    }
}