package com.braive.UserManagementSystem.repository;

import com.braive.UserManagementSystem.repository.model.Psychologist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PsychologistRepository extends JpaRepository<Psychologist, UUID>, JpaSpecificationExecutor<Psychologist> {
}
