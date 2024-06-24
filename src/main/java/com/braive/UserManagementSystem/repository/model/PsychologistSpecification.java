package com.braive.UserManagementSystem.repository.model;

import com.braive.UserManagementSystem.controller.model.PsychologistFilter;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PsychologistSpecification implements Specification<Psychologist> {

    private final PsychologistFilter filter;

    public PsychologistSpecification(final PsychologistFilter filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(Root<Psychologist> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        final List<Predicate> predicates = new ArrayList<>();
        Optional.ofNullable(
                filter.id()).ifPresent(
                        id -> predicates.add(criteriaBuilder.equal(root.get(Psychologist_.ID), id))
        );
        Optional.ofNullable(
                filter.name()).ifPresent(
                        name -> predicates.add(criteriaBuilder.equal(root.get(Psychologist_.NAME), name))
        );
        Optional.ofNullable(
                filter.nationalIdentificationNumber()).ifPresent(
                        nationalIdentificationNumber -> predicates.add(
                                criteriaBuilder.equal(root.get(Psychologist_.NATIONAL_IDENTIFICATION_NUMBER), nationalIdentificationNumber)
                        )
        );
        Optional.ofNullable(
                filter.dateOfBirth()).ifPresent(
                        dateOfBirth -> predicates.add(criteriaBuilder.equal(root.get(Psychologist_.DATE_OF_BIRTH), dateOfBirth))
        );
        Optional.ofNullable(
                filter.organization()).ifPresent(
                        organization -> predicates.add(criteriaBuilder.equal(root.get(Psychologist_.ORGANIZATION), organization))
        );
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }
}
