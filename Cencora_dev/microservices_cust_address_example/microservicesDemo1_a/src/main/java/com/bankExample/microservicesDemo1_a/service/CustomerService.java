package com.bankExample.microservicesDemo1_a.service;

import com.bankExample.microservicesDemo1_a.entity.Customer;
import com.bankExample.microservicesDemo1_a.repository.CustomerRepo;
import com.bankExample.microservicesDemo1_a.response.AddressResponse;
import com.bankExample.microservicesDemo1_a.response.CustomerResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
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
    private WebClient webClient;
    @Autowired
    private RestTemplate restTemplate;
    @Value("${addressservice.base.url}")
    private String addressBaseUrl;

//    public CustomerService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//    public CustomerService(@Value("${addressservice.base.url}")
//                            String addressBaseUrl,
//                           RestTemplateBuilder restTemplateBuilder){
//        System.out.println(addressBaseUrl);
//        this.restTemplate=restTemplateBuilder.rootUri(addressBaseUrl).build();
//    }



    public CustomerResponse getCustomerById(int id){
        AddressResponse addressResponse;
        Customer customer= customerRepo.findById(id).get();
//        System.out.println(addressBaseUrl);

        //addressResponse=restTemplate.getForObject(addressBaseUrl +"/address/{id}", AddressResponse.class,id);
        /*above line and that CustomerService constructor,
         is not required if we directly build() the restTemplate in cong file...
          if we don't do it in config then we have to do it in the constructor here*/

        addressResponse=restTemplate.getForObject("/address/{id}", AddressResponse.class,id);
        CustomerResponse customerResponse= modelMapper.map(customer,CustomerResponse.class);
        //addressResponse= webClient.get().uri("/address/"+id).retrieve().bodyToMono(AddressResponse.class).block();
        customerResponse.setAddressResponse(addressResponse);
        return customerResponse;
    }
}
