package com.example.chillax.web;

import com.example.chillax.dao.Credentials;
import com.example.chillax.dao.NewUserDetails;
import com.example.chillax.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasicController {

    @Autowired
    UserService userService;


    public BasicController (UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/checking", method = RequestMethod.GET)
    public String checkUser(@RequestParam String username, @RequestParam String password) {

        return userService.checkIfUserExist(new Credentials(username, password));


    }


    //below api is just for the testing purposes
    @GetMapping(value = "/checkUser")
    public String checkUserDemo() {

        return "This is abhishek chaturbvedi";


    }


    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public String insertUser(@RequestBody NewUserDetails newuserDetails) {

        return userService.insertUser(newuserDetails);


    }



}
