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


    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private List<Tour> choiceTourList;



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

    public List<Tour> getChoiceTourList() {
        return choiceTourList;
    }

    public void setChoiceTourList(List<Tour> choiceTourList) {
        choiceTourList = choiceTourList;
    }

    public Choice() {
    }
}
