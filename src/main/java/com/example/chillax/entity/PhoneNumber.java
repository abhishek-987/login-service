package com.example.chillax.entity;

import javax.persistence.Embeddable;

@Embeddable
public class PhoneNumber {

    int countryCode;

    int phoneNumber;

    public PhoneNumber(int countryCode, int phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber() {

    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
