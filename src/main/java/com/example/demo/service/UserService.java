package com.example.demo.service;

import com.example.demo.dao.Credentials;
import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String checkIfUserExist(Credentials credentials) {
        Optional<Users> user = userRepository.findById(credentials.getUsername());
        if(user.isPresent()) {
            if(credentials.getPassword().equals(user.get().getPassword())) {
                return "Username and password exists";
            }else {
                return "Password is wrong";
            }
        }else {
            return "Username doesn't exists";
        }

    }

    public String insertUser(Credentials credentials) {
        Optional<Users> user = userRepository.findById(credentials.getUsername());
        if(user.isPresent()) {
            return "Username is already Present";
        }else {
            userRepository.save(new Users(credentials.getUsername(), credentials.getPassword()));
            return "User Stored";
        }
    }


}
