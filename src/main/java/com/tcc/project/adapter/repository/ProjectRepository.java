package com.tcc.project.adapter.repository;

import com.tcc.project.entity.Project;
import com.tcc.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, String>, JpaSpecificationExecutor<Project> {

}
