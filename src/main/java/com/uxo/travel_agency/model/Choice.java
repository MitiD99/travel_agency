package com.uxo.travel_agency.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "choice")
public class Choice {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_NAME")
    private User user;

    @OneToMany(mappedBy = "Choice", cascade = CascadeType.ALL)
    private List<UserChoiceTour> userChoiceTourList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<UserChoiceTour> getUserChoiceTourList() {
        return userChoiceTourList;
    }

    public void setUserChoiceTourList(List<UserChoiceTour> userChoiceTourList) {
        this.userChoiceTourList = userChoiceTourList;
    }

    public Choice() {
    }
}
