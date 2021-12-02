package com.mash.project_mark_2.services;

import com.mash.project_mark_2.models.User;
import com.mash.project_mark_2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getCustomerByEmail(String email)  {
        User user = userRepository.findByEmail(email);
        return user;
    }

}
