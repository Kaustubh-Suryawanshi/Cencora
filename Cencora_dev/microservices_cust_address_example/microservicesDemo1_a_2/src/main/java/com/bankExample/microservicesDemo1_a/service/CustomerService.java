package com.bankExample.microservicesDemo1_a.service;

import com.bankExample.microservicesDemo1_a.entity.Customer;
import com.bankExample.microservicesDemo1_a.feignclient.AddressClient;
import com.bankExample.microservicesDemo1_a.repository.CustomerRepo;
import com.bankExample.microservicesDemo1_a.response.AddressResponse;
import com.bankExample.microservicesDemo1_a.response.CustomerResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private final AddressClient addressClient;
    //spring will create the implementation for this class and inject the proxy

    @Autowired
    public CustomerService(AddressClient addressClient) {
        this.addressClient = addressClient;
    }

    public CustomerResponse getCustomerById(int id){
        AddressResponse addressResponse;
        Customer customer= customerRepo.findById(id).get();
         ResponseEntity <AddressResponse> addressResponseResponseEntity =addressClient.getCustomerDetails(id);
         addressResponse= addressResponseResponseEntity.getBody();
        CustomerResponse customerResponse= modelMapper.map(customer,CustomerResponse.class);
        customerResponse.setAddressResponse(addressResponse);
        return customerResponse;
    }
}
