package com.pack.trainBookings.service;

import com.pack.trainBookings.entity.Trains;
import com.pack.trainBookings.repository.TrainRepo;
import com.pack.trainBookings.response.TrainResponseForUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static com.pack.trainBookings.response.TrainResponseForUser.mapObjecttoTrainresponse;

@Service
public class TrainService {
    @Autowired
    private TrainRepo trainRepo;


    public List<Trains> getAllTrains(){
        List<Trains> response=trainRepo.findAll();

        return response;
    }

    public List<TrainResponseForUser> getTrainsUsingSrcDesDate(String src, String des, LocalDate dep_date){
        List<Object[]> response=trainRepo.getTrainsWithSrcDesDate( src,  des,  dep_date);
        return mapObjecttoTrainresponse(response);
    }

    public List<TrainResponseForUser> getTrainByName(String name) {
        List<Object[]> response=trainRepo.getTrainsWithName(name);
        return mapObjecttoTrainresponse(response);
    }

    public List<TrainResponseForUser> getTrainByNumber(String number) {
        List<Object[]> response=trainRepo.getTrainsWithNumber(number);
        return mapObjecttoTrainresponse(response);
    }

    public Trains addTrainDetails(Trains train) {
        if(!trainRepo.getTrainsWithNumber(train.getTrain_no()).isEmpty() || !trainRepo.getTrainsWithName(train.getTrain_name()).isEmpty()){
            return null;
          }
        return trainRepo.save(train);
    }


    public Optional<Trains> updateTrains(int id, Trains traindetailsToUpdate) {
        Optional<Trains> updateTrain=trainRepo.findById(id);
        if(updateTrain.isPresent()) {
            Trains train=updateTrain.get();
            if(traindetailsToUpdate.getTrain_no() !=null && trainRepo.getTrainsWithNumber(traindetailsToUpdate.getTrain_no()).isEmpty()) {
                train.setTrain_no(traindetailsToUpdate.getTrain_no());
            }
            if(traindetailsToUpdate.getTrain_name() !=null && trainRepo.getTrainsWithName(traindetailsToUpdate.getTrain_name()).isEmpty()) {
                train.setTrain_name(traindetailsToUpdate.getTrain_name());
            }
            if(traindetailsToUpdate.getFrom_source() !=null) train.setFrom_source(traindetailsToUpdate.getFrom_source());
            if(traindetailsToUpdate.getTo_destination() !=null) train.setTo_destination(traindetailsToUpdate.getTo_destination());
            if(traindetailsToUpdate.getDeparture_date() !=null) train.setDeparture_date(traindetailsToUpdate.getDeparture_date());
            if(traindetailsToUpdate.getArrival_date() !=null) train.setArrival_date(traindetailsToUpdate.getArrival_date());
            if(traindetailsToUpdate.getDeparture_time() !=null) train.setDeparture_time(traindetailsToUpdate.getDeparture_time());
            if(traindetailsToUpdate.getTotal_seats() !=0) train.setTotal_seats(traindetailsToUpdate.getTotal_seats());
            if(traindetailsToUpdate.getAvailable_seats() !=0) train.setAvailable_seats(traindetailsToUpdate.getAvailable_seats());
            if(traindetailsToUpdate.getAmount_per_seat() !=0) train.setAmount_per_seat(traindetailsToUpdate.getAmount_per_seat());

            return Optional.of(trainRepo.save(train));
        }
        return null;
    }

    public List<Trains> deleteTrain(int id) {
        if(trainRepo.findById(id).isPresent()){
            trainRepo.deleteById(id);
            return trainRepo.findAll();
        }
        return null;
    }
}
