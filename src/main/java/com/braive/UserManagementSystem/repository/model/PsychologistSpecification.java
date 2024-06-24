package com.braive.UserManagementSystem.repository.model;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class PsychologistSpecification implements Specification<Psychologist> {

    private final Psychologist psychologist;

    public PsychologistSpecification(final Psychologist psychologist) {
        this.psychologist = psychologist;
    }

    @Override
    public Predicate toPredicate(Root<Psychologist> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
    }
}
