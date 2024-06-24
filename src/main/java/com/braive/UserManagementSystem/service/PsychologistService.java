package com.braive.UserManagementSystem.service;

import com.braive.UserManagementSystem.controller.model.CreatePsychologistRequest;
import com.braive.UserManagementSystem.controller.model.PsychologistResponse;
import com.braive.UserManagementSystem.mapper.PsychologistMapper;
import com.braive.UserManagementSystem.repository.PsychologistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PsychologistService {

    private final PsychologistRepository psychologistRepository;

    public PsychologistResponse createPsychologist(CreatePsychologistRequest psychologistRequest) {
        return PsychologistMapper.toResponse(
                psychologistRepository.save(PsychologistMapper.fromCreateRequest(psychologistRequest))
        );
    }
}
