package com.uxo.travel_agency.service.lmpl;

import com.uxo.travel_agency.model.Tour;
import com.uxo.travel_agency.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourService tourService;

    @Override
    public void create(Tour tour) {
        tourService.create(tour);
    }

    @Override
    public Tour findById(int id) {
        return tourService.findById(id);
    }


    @Override
    public void deleteAll(Tour tourDelete){tourService.deleteAll(tourDelete);};
}
