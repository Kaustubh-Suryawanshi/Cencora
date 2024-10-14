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
    String select="select t from Trains t";

    @Query(select +" WHERE (t.from_source = :src)" +"AND (t.to_destination = :des) " +"AND t.departure_date = :dep_date")
    List<Trains> getTrainsWithSrcDesDate(String src, String des, LocalDate dep_date);

    @Query(select +" WHERE t.train_name=:name")
    List<Trains> getTrainsWithName(@Param("name") String name);

    @Query(select +" WHERE t.train_no=:number")
    List<Trains> getTrainsWithNumber(String number);

    @Query(select +" Where (t.from_source = :src) AND (t.to_destination = :des)  AND t.departure_date = :dep_date AND t.total_seats > t.available_seats")
    List<Trains> getTrainsWithSrcDesDateAdmin(String src, String des, LocalDate dep_date);
}
