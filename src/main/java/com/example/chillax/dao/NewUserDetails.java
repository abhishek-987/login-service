package com.example.chillax.dao;

import com.example.chillax.entity.PhoneNumber;

public class NewUserDetails {
    
    Credentials credentials;
    String fullName;
    String email;
    PhoneNumber phoneNumber;

    public NewUserDetails(Credentials credentials, String fullName, String email, PhoneNumber phoneNumber) {
        this.credentials = credentials;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
