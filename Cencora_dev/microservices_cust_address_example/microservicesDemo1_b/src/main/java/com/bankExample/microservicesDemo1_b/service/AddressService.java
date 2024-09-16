package com.bankExample.microservicesDemo1_b.service;


import com.bankExample.microservicesDemo1_b.entity.Address;
import com.bankExample.microservicesDemo1_b.repository.AddressRepo;
import com.bankExample.microservicesDemo1_b.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper modelMapper;

    public AddressResponse findAddressById(int id){
        Address address= addressRepo.findAddressByCustomerId(id);
        AddressResponse addressResponse= modelMapper.map(address,AddressResponse.class);
        return addressResponse;
    }
}
