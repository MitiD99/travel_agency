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


    public User read(int id) {
        return userRepository.findById(id).orElseThrow();
    }

    public void delete(int id) {
        User userToDelete = userRepository.getById(id);
        userRepository.delete(userToDelete);
    }

    public User update(User user) {
        User userToUpdate = userRepository.getById(user.getId());
        userToUpdate.setRoleList(user.getRoleList());
        userToUpdate.setUser_last_name(user.getUser_last_name());
        userToUpdate.setUser_name(user.getUser_name());
        userToUpdate.setUserEmail(user.getUserEmail());
        userToUpdate.setUserPhoneNumber(user.getUserPhoneNumber());
        return userRepository.save(userToUpdate);
    }
}
