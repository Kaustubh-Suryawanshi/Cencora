/*
package com.pack.trainBookings.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainResponseForUser {
    private int train_id;
    private String train_no;
    private String train_name;
    private String from_source;
    private String to_destination;
    private LocalDate departure_date;
    private LocalDate arrival_date;
    private LocalTime departure_time;
    private LocalTime arrival_time;
    private int available_seats;
    private double amount_per_seat;

    public static List<TrainResponseForUser> mapObjecttoTrainresponse(List<Object[]> res){
        List<TrainResponseForUser> trainResponsForUsers =new ArrayList<>();
        for(Object[] obj:res){
            int id=(Integer) obj[0];
            String number= obj[1].toString();
            String name= obj[2].toString();
            String from= obj[3].toString();
            String to= obj[4].toString();
            LocalDate dept_date=(LocalDate) obj[5];
            LocalDate arr_date=(LocalDate) obj[6];
            LocalTime dep_time =(LocalTime) obj[7];
            LocalTime arr_time= (LocalTime) obj[8];
            int available_seats=(Integer) obj[9];
            double amount_per_seat=(Double)obj[10];
            trainResponsForUsers.add(new TrainResponseForUser(id,number,name,from,to,dept_date,arr_date,dep_time,arr_time,available_seats,amount_per_seat));
        }
        return trainResponsForUsers;
    }

}
*/
