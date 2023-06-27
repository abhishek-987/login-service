package com.example.demo.dao;

import com.example.demo.entity.PhoneNumber;

public class NewuserDetails {
    
    Credentials credentials;
    String email;
    PhoneNumber phoneNumber;

    public NewuserDetails(Credentials credentials, String email, PhoneNumber phoneNumber) {
        this.credentials = credentials;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public String getEmail() {
        return email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
