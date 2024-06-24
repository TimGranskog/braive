package com.braive.UserManagementSystem.repository.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "psychologist")
public class Psychologist {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String nationalIdentificationNumber;

    private Date dateOfBirth;

    private String organization;

    @OneToMany(mappedBy = "psychologist", fetch = FetchType.LAZY)
    private List<Patient> patients = new ArrayList<>();

}
