package com.braive.UserManagementSystem.controller.model;

public record PatientResponse(
        String id,
        String name,
        String nationalIdentificationNumber,
        String dateOfBirth,
        String organization
) {
}
