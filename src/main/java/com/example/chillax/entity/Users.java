package com.example.chillax.entity;

import javax.persistence.*;

import java.util.Objects;

@Entity
public class Users extends UsernameEntity {

    @Column(nullable=false)
    String password;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users() {

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
