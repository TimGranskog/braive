package com.braive.UserManagementSystem.controller.model;

public record PsychologistRequest(
        String name,
        String nationalIdentificationNumber,
        String dateOfBirth,
        String organization
) {
}
