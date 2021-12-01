package com.uxo.travel_agency.service.lmpl;

import com.uxo.travel_agency.model.User;
import com.uxo.travel_agency.repositotory.UserRepository;
import com.uxo.travel_agency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUsrByEmail(String userEmail) {
        return userRepository.findByUserEmail(userEmail);
    }


    public User read(int id){return userRepository.read(id);}

    public User delete(int id){
        return userRepository.delete(id);
    }

    public User update(int id){
        return userRepository.update(id);
    }
}
