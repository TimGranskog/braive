package com.braive.UserManagementSystem.controller.model;

import java.util.List;

public record PsychologistResponse(
        String id,
        String name,
        String nationalIdentificationNumber,
        String dateOfBirth,
        String organization,
        List<PatientResponse> patients
) {
}
