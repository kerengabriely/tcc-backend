package com.tcc.project.usecase;

import com.tcc.project.adapter.repository.ProjectRepository;
import com.tcc.project.entity.Project;
import com.tcc.project.specification.ProjectSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class GetAllProjectUseCase {

    private final ProjectRepository repository;

    public List<Project> execute(String title, String description, String requirements, String status, String creationDate, String idEntrepreneur, LocalDate deadLine) {
        return repository.findAll(
                ProjectSpecification.build(
                        Optional.empty(),
                        Optional.ofNullable(title),
                        Optional.ofNullable(description),
                        Optional.ofNullable(requirements),
                        Optional.ofNullable(status),
                        Optional.ofNullable(creationDate),
                        Optional.ofNullable(idEntrepreneur),
                        Optional.ofNullable(deadLine)
                )
        );
    }
}
