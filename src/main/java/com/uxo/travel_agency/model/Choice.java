package com.uxo.travel_agency.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "choice")
public class Choice {

    @Id
    @Column(name = "id")
    private int choiceId;

    @ManyToOne
    @JoinColumn(name = "USER_NAME")
    private User user;

    @OneToMany(mappedBy = "Choice", cascade = CascadeType.ALL)
    private List<Tour> userChoiceTourList;



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(int choiceId) {
        this.choiceId = choiceId;
    }

    public List<Tour> getUserChoiceTourList() {
        return userChoiceTourList;
    }

    public void setUserChoiceTourList(List<Tour> userChoiceTourList) {
        this.userChoiceTourList = userChoiceTourList;
    }

    public Choice() {
    }
}
