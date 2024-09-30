package com.MongoHiber.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
public class Address {
    private String city;
    private String state;
    private String pincode;
}
