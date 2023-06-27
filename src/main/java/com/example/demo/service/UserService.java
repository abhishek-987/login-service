package com.example.demo.service;

import com.example.demo.dao.Credentials;
import com.example.demo.dao.NewuserDetails;
import com.example.demo.entity.UserDetails;
import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserdetialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserdetialsRepository userdetialsRepository;

    public UserService(UserRepository userRepository, UserdetialsRepository userdetialsRepository) {
        this.userRepository = userRepository;
        this.userdetialsRepository = userdetialsRepository;
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

    public String insertUser(NewuserDetails newuserDetails) {
        Optional<UserDetails> user = userdetialsRepository.findById(newuserDetails.getCredentials().getUsername());
        if(user.isPresent()) {
            return "Username is already Present";
        }else {
            userRepository.save(new Users(newuserDetails.getCredentials().getUsername(), newuserDetails.getCredentials().getPassword()));
            userdetialsRepository.save(new UserDetails(newuserDetails.getCredentials().getUsername(), newuserDetails.getEmail(), newuserDetails.getPhoneNumber()));
            return "User Stored";
        }
    }


}
