package com.braive.UserManagementSystem.controller.model;

import java.sql.Date;

public record CreatePsychologistRequest(
        String name,
        String nationalIdentificationNumber,
        String dateOfBirth,
        String organization
) {
}
