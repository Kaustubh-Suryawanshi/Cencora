package com.pack.trainBookings.controller;


import com.pack.trainBookings.entity.Trains;
import com.pack.trainBookings.response.TrainResponseForAdmin;
import com.pack.trainBookings.response.TrainResponseForUser;
import com.pack.trainBookings.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/train")
public class TrainController {
    @Autowired
    private TrainService trainService;
//    get all trains(no use)
    @GetMapping("/search/alltrains")
    public ResponseEntity<List<Trains>> getdetails(){
        List<Trains> trainResponse=trainService.getAllTrains();
        return ResponseEntity.status(HttpStatus.CREATED).body(trainResponse);
    }


//    get trains by src/des and dep date
//    localhost:8080/trains?src=delhi&des=mumbai&date=2024-10-11
        @GetMapping("/search/listoftrains")
        public ResponseEntity<List<TrainResponseForUser>> getDetails(@RequestParam String src, @RequestParam String des, @RequestParam String date){
            LocalDate localDate= LocalDate.parse(date);
            List<TrainResponseForUser> trainResponseForUser =trainService.getTrainsUsingSrcDesDate(src,des,localDate);
            if(trainResponseForUser.size()==0) return null;
           return ResponseEntity.status(HttpStatus.CREATED).body(trainResponseForUser);
        }



//    get trains by name
    @GetMapping("/search/trainbyname")
    public ResponseEntity<List<TrainResponseForUser>> getbyName(@RequestParam String name){
        List<TrainResponseForUser> trainResponsForUsers = trainService.getTrainByName(name);
        return ResponseEntity.status(HttpStatus.CREATED).body(trainResponsForUsers);
    }

//    get trains by train number
    @GetMapping("/search/trainbynumber")
    public ResponseEntity<List<TrainResponseForUser>> getbyNumber(@RequestParam String number){
        List<TrainResponseForUser> trainResponsForUsers = trainService.getTrainByNumber(number);
        return ResponseEntity.status(HttpStatus.CREATED).body(trainResponsForUsers);
    }

//    add new train(admin only)
    @PostMapping("/add")
    public ResponseEntity<Trains> addTrain(@RequestBody Trains train){
        Trains trains= trainService.addTrainDetails(train);
        return ResponseEntity.status(HttpStatus.CREATED).body(trains);
    }
//    delete train(admin only)
//    @PostMapping("/trains/delete")
    @PostMapping("/delete/{id}")
    public ResponseEntity<List<Trains>> deleteTrain(@PathVariable int id){
        List<Trains> res= trainService.deleteTrain(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(res!=null?res:null);
    }
//    update train details(admin only)
    @PatchMapping("/update/{id}")
    public ResponseEntity<Optional<Trains>> updateTrain(@PathVariable int id, @RequestBody Trains train){
        Optional<Trains> res= trainService.updateTrains(id,train);
        return ResponseEntity.status(HttpStatus.CREATED).body(res!=null?res:null);
    }
//    get trains for admin
    /*@GetMapping("/adminsearch")
    public ResponseEntity<TrainResponseForAdmin> getTrainDetailsForAdmin(){

    }*/

}
