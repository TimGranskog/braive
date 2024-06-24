package com.braive.UserManagementSystem.controller;

import com.braive.UserManagementSystem.controller.model.CreatePsychologistRequest;
import com.braive.UserManagementSystem.controller.model.PsychologistFilter;
import com.braive.UserManagementSystem.controller.model.PsychologistResponse;
import com.braive.UserManagementSystem.service.PsychologistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/psychologists")
@RequiredArgsConstructor
public class PsychologistController {

    private final PsychologistService psychologistService;

    @PostMapping
    public ResponseEntity<PsychologistResponse> createPsychologist(@RequestBody final CreatePsychologistRequest psychologistRequest) {
        return ResponseEntity.ok(psychologistService.createPsychologist(psychologistRequest));
    }

    @GetMapping
    public ResponseEntity<List<PsychologistResponse>> getPsychologistsByFilter(final PsychologistFilter filter) {
        return ResponseEntity.ok(psychologistService.getByFilter(filter));
    }
}
