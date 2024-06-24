package com.braive.UserManagementSystem.controller.model;

public record PsychologistFilter(
        String id,
        String name,
        String nationalIdentificationNumber,
        String dateOfBirth,
        String organization
) {
}
