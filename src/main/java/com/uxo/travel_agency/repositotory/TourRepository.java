package com.uxo.travel_agency.repositotory;

import com.uxo.travel_agency.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> {
    void crete(int id);
    void deleteAll(int id);
    Tour findById(int id);
}
