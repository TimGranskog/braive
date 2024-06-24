package com.braive.UserManagementSystem.service;

import com.braive.UserManagementSystem.controller.model.CreatePsychologistRequest;
import com.braive.UserManagementSystem.controller.model.PsychologistFilter;
import com.braive.UserManagementSystem.controller.model.PsychologistResponse;
import com.braive.UserManagementSystem.mapper.PsychologistMapper;
import com.braive.UserManagementSystem.repository.PsychologistRepository;
import com.braive.UserManagementSystem.repository.model.PsychologistSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PsychologistService {

    private final PsychologistRepository psychologistRepository;

    public PsychologistResponse createPsychologist(final CreatePsychologistRequest psychologistRequest) {
        return PsychologistMapper.toResponse(
                psychologistRepository.save(PsychologistMapper.fromCreateRequest(psychologistRequest))
        );
    }

    public List<PsychologistResponse> getByFilter(final PsychologistFilter filter) {
        return psychologistRepository.findAll(new PsychologistSpecification(filter)).stream().map(PsychologistMapper::toResponse).toList();
    }
}
