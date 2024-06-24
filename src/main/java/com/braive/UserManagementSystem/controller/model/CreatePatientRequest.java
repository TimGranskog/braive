package com.braive.UserManagementSystem.controller.model;


public record CreatePatientRequest(
        String name,
        String nationalIdentificationNumber,
        String dateOfBirth,
        String organization
) {
}
