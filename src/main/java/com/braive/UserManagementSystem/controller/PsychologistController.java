package com.braive.UserManagementSystem.controller;

import com.braive.UserManagementSystem.controller.model.CreatePsychologistRequest;
import com.braive.UserManagementSystem.controller.model.PsychologistResponse;
import com.braive.UserManagementSystem.service.PsychologistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/psychologists")
@RequiredArgsConstructor
public class PsychologistController {

    private final PsychologistService psychologistService;

    @PostMapping
    public PsychologistResponse createPsychologist(@RequestBody CreatePsychologistRequest psychologistRequest) {
        return psychologistService.createPsychologist(psychologistRequest);
    }
}
