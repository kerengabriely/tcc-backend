package com.tcc.application.usecase;

import com.tcc.application.adapter.repository.ApplicationRepository;
import com.tcc.application.dto.CreateApplicationDto;
import com.tcc.application.entity.Application;
import com.tcc.project.adapter.repository.ProjectRepository;
import com.tcc.student.adapter.repository.StudentRepository;
import com.tcc.student.entity.Student;
import com.tcc.project.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class CreateApplicationUseCase {

    private final ApplicationRepository repository;
    private final StudentRepository studentRepository;
    private final ProjectRepository projectRepository;

    public void execute(CreateApplicationDto dto) {
        Project project = projectRepository.findById(dto.getIdProject())
                .orElseThrow(() -> new IllegalArgumentException("Projeto não encontrado."));

        // Criar a entidade Application
        Application application = new Application();
        application.setIdea(dto.getIdea());
        application.setValue(dto.getValue());
        application.setIdProject(project);
        application.setIdStudent(null);

        application.setStatus("ANALYZE");
        application.setApplicationDate(LocalDateTime.now());

        repository.save(application);
    }
}
