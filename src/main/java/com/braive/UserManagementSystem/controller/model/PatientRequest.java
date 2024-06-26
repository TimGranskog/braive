package com.braive.UserManagementSystem.controller.model;


public record PatientRequest(
        String name,
        String nationalIdentificationNumber,
        String dateOfBirth,
        String organization
) {
}
