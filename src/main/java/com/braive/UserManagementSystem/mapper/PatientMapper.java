package com.braive.UserManagementSystem.mapper;

import com.braive.UserManagementSystem.controller.model.PatientResponse;
import com.braive.UserManagementSystem.repository.model.Patient;

public final class PatientMapper {

    private PatientMapper() {}

    public static PatientResponse toPatientResponse(final Patient patient) {
        return new PatientResponse(
                patient.getId().toString(),
                patient.getName(),
                patient.getNationalIdentificationNumber(),
                patient.getDateOfBirth().toString(),
                patient.getOrganization()
        );
    }
}
