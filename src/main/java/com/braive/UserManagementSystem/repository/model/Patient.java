package com.braive.UserManagementSystem.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity(name = "patient")
public class Patient {

    @Id
    private UUID id;

}
