package com.braive.UserManagementSystem.controller;

import com.braive.UserManagementSystem.service.PsychologistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/psychologists")
@RequiredArgsConstructor
public class PsychologistController {

    private final PsychologistService psychologistService;
}
