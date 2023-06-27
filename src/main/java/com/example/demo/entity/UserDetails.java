package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

    @Id
    String username;

    String email;

    PhoneNumber phoneNumber;

    public UserDetails(String username, String email, PhoneNumber phoneNumber) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public UserDetails() {

    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
