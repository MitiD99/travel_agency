package com.uxo.travel_agency.model;



import javax.persistence.*;

@Entity
@Table(name = "user_choice")
public class UserChoiceTour {

    @Id
    @Column(name = "ID")
    private int id;


    @ManyToOne
    @JoinColumn(name = "TOUR_ID")
    private Tour tour_id;
}
