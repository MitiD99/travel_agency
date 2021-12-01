package com.uxo.travel_agency.repositotory;

import com.uxo.travel_agency.model.Choice;
import com.uxo.travel_agency.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Integer> {
    List<Choice> findByUser(User user);
}
