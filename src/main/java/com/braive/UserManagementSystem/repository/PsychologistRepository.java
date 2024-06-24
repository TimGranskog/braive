package com.braive.UserManagementSystem.repository;

import com.braive.UserManagementSystem.repository.model.Psychologist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsychologistRepository extends JpaRepository<Psychologist, String> {
}
