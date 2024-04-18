package com.example.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Class is DB
@Data  // Does getters setters
public class Users {

    @Id
    @GeneratedValue // Not needed, will auto_increment
    private int idUser;
    private String first_name;
    private String last_name;
    private String username;
    private String passwd;
    private String email;

}
