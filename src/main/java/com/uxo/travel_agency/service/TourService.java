package com.uxo.travel_agency.service;

import com.uxo.travel_agency.model.Tour;

public interface TourService {
    void create(Tour tour);

    Tour findById(int id);


    void deleteAll(Tour tourDelete);
}
