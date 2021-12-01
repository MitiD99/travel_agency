package com.uxo.travel_agency.service;

import com.uxo.travel_agency.model.User;

public interface UserService {
    void create (User user);

    User findUsrByEmail(String userEmail);

    User read(int id);

    User delete(int id);

    User update(int id);
}
