package com.example.chillax.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class UsernameEntity {

    @Id
    String username;


}
