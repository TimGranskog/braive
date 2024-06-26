package com.braive.UserManagementSystem.mapper;

import com.braive.UserManagementSystem.controller.model.PsychologistRequest;
import com.braive.UserManagementSystem.controller.model.PsychologistResponse;
import com.braive.UserManagementSystem.repository.model.Psychologist;

import java.sql.Date;

public final class PsychologistMapper {

    private PsychologistMapper() {}

    public static Psychologist fromCreateRequest(final PsychologistRequest psychologistRequest) {
        final Psychologist psychologist = new Psychologist();
        psychologist.setName(psychologistRequest.name());
        psychologist.setNationalIdentificationNumber(psychologistRequest.nationalIdentificationNumber());
        psychologist.setDateOfBirth(Date.valueOf(psychologistRequest.dateOfBirth()));
        psychologist.setOrganization(psychologistRequest.organization());
        return psychologist;
    }

    public static PsychologistResponse toResponse(final Psychologist psychologist) {
        return new PsychologistResponse(
                psychologist.getId().toString(),
                psychologist.getName(),
                psychologist.getNationalIdentificationNumber(),
                psychologist.getDateOfBirth().toString(),
                psychologist.getOrganization(),
                psychologist.getPatients().stream().map(PatientMapper::toPatientResponse).toList()
        );
    }

    public static void updatePsychologist(final Psychologist psychologist, final PsychologistRequest request) {
        psychologist.setName(request.name());
        psychologist.setNationalIdentificationNumber(request.nationalIdentificationNumber());
        psychologist.setDateOfBirth(Date.valueOf(request.dateOfBirth()));
        psychologist.setOrganization(request.organization());
    }
}
