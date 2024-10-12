package com.pack.trainBookings.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingDTO {
    private int id;
    private int user_id;
    private String passenger_name;
    private int passenger_age;
    private String passenger_gender;
    private LocalDateTime booking_date;
    private int train_id;
}
