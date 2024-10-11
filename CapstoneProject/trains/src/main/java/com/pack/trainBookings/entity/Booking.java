package com.pack.trainBookings.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int booking_id;
    @Column(name = "user_id")
    private int user_id;
    /*@Column(name = "train_id")
    private int train_id;*/
    @Column(name = "passenger_name")
    private String passenger_name;
    @Column(name = "passenger_age")
    private int passenger_age;
    @Column(name = "passenger_gender")
    private String passenger_gender;
    @Column(name= "booking_date" )
    private LocalDateTime booking_date;

    @ManyToOne
    @JoinColumn(name = "train_id")// Foreign key column
    private Trains train;
}
