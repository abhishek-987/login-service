package com.example.chillax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class UserDetails extends Username {

    @Column(nullable=false)
    String fullName;

    @Column(unique=true)
    String email;

    @Column(unique=true)
    PhoneNumber phoneNumber;

    public UserDetails(String username, String fullName, String email, PhoneNumber phoneNumber) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public UserDetails() {

    }

    public String getUsername() {
        return username;
    }

    public String fullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
