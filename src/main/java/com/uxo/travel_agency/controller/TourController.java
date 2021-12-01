package com.uxo.travel_agency.controller;

import com.uxo.travel_agency.model.Tour;
import com.uxo.travel_agency.model.User;
import com.uxo.travel_agency.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TourController {

    @Autowired
    private TourService tourService;

    @PostMapping("/tour")
    public ResponseEntity<?> crateTour(@RequestBody Tour tour) {
        tourService.create(tour);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/tour/{id}")
    public ResponseEntity<?> findTourById(@PathVariable int id) {
        Tour tour = tourService.findById(id);
        return new ResponseEntity<>(tour, HttpStatus.OK);
    }

}
