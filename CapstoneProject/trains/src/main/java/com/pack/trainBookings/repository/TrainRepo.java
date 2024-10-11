package com.pack.trainBookings.repository;

import com.pack.trainBookings.entity.Trains;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TrainRepo extends JpaRepository<Trains,Integer> {
    String selectExpectTotalSeats ="SELECT t.train_id,t.train_no, t.train_name,t.from_source, t.to_destination, t.departure_date,t.arrival_date,t.departure_time,t.arrival_time,t.available_seats,t.amount_per_seat FROM Trains t";

    @Query(selectExpectTotalSeats +" WHERE (t.from_source = :src)" +"AND (t.to_destination = :des) " +"AND t.departure_date = :dep_date")
    List<Object[]> getTrainsWithSrcDesDate(String src, String des, LocalDate dep_date);

    @Query(selectExpectTotalSeats +" WHERE t.train_name=:name")
    List<Object[]> getTrainsWithName(@Param("name") String name);

    @Query(selectExpectTotalSeats +" WHERE t.train_no=:number")
    List<Object[]> getTrainsWithNumber(String number);
}
