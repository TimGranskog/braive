package com.braive.UserManagementSystem.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity(name = "psychologist")
public class Psychologist {

    @Id
    private UUID id;
}
