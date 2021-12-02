package com.uxo.travel_agency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tour")
public class Tour {

    @Id
    @Column(name = "TOUR_ID")
    private int id;

    @Column(name = "TOUR_COUNTRY")
    private String country;

    @Column(name = "TOUR_TOWN")
    private String town;

    @Column(name = "TOUR_DATE_START")
    private String dateStart;

    @Column(name = "TOUR_DATE_END")
    private String dateEnd;

    @Column(name = "TOUR_PRICE")
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHOICE")
    private Choice choice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Tour() {
    }
}
