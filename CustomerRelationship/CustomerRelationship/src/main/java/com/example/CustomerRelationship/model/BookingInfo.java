package com.example.CustomerRelationship.model;

import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;

public class BookingInfo {
    @Column
    Customer customer;

    @Id
    private int bid;





}
