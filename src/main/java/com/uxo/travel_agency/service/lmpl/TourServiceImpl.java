package com.uxo.travel_agency.service.lmpl;

import com.uxo.travel_agency.model.Tour;
import com.uxo.travel_agency.repositotory.TourRepository;
import com.uxo.travel_agency.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;

    @Override
    public void create(Tour tour) {
        tourRepository.save(tour);
    }

    @Override
    public Tour findById(int id) {
        return tourRepository.findById(id).orElseThrow();
    }


    @Override
    public void delete(Tour tourDelete){tourRepository.delete(tourDelete);};
}
