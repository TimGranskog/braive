package com.braive.UserManagementSystem.service;

import com.braive.UserManagementSystem.controller.model.PsychologistRequest;
import com.braive.UserManagementSystem.controller.model.PsychologistFilter;
import com.braive.UserManagementSystem.controller.model.PsychologistResponse;
import com.braive.UserManagementSystem.mapper.PsychologistMapper;
import com.braive.UserManagementSystem.repository.PsychologistRepository;
import com.braive.UserManagementSystem.repository.model.Psychologist;
import com.braive.UserManagementSystem.repository.model.PsychologistSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PsychologistService {

    private final PsychologistRepository psychologistRepository;

    public PsychologistResponse createPsychologist(final PsychologistRequest psychologistRequest) {
        return PsychologistMapper.toResponse(
                psychologistRepository.save(PsychologistMapper.fromCreateRequest(psychologistRequest))
        );
    }

    public List<PsychologistResponse> getByFilter(final PsychologistFilter filter) {
        return psychologistRepository.findAll(new PsychologistSpecification(filter)).stream().map(PsychologistMapper::toResponse).toList();
    }

    @Transactional
    public PsychologistResponse updatePsychologist(final UUID id, final PsychologistRequest psychologistRequest) {
        final Optional<Psychologist> psychologistOptional = psychologistRepository.findById(id);
        if (psychologistOptional.isPresent()) {
            final Psychologist psychologist = psychologistOptional.get();
            PsychologistMapper.updatePsychologist(psychologist, psychologistRequest);
            return PsychologistMapper.toResponse(psychologist);
        } else {
            throw new IllegalArgumentException(String.format("Psychologist with id '%s' not found", id));
        }

    }

    public void deletePsychologist(final UUID id) {
        psychologistRepository.deleteById(id);
    }
}
