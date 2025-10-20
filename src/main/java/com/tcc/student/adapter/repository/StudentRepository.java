package com.tcc.student.adapter.repository;

import com.tcc.student.entity.Student;
import com.tcc.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, String>, JpaSpecificationExecutor<Student> {
    Optional<Student> findByUser_Id(Long id);
    Optional<Student> findByEmail(String email);
}
