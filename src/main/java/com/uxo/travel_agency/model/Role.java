package com.uxo.travel_agency.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name = "ROLE")
    private String role;

    @ManyToOne
    @JoinColumn(name = "USER_NAME")
    private User user;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role() {

    }
}
