package com.tcc.entrepreneur.adapter.repository;

import com.tcc.entrepreneur.entity.Entrepreneur;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EntrepreneurRepository extends JpaRepository<Entrepreneur, String>, JpaSpecificationExecutor<Entrepreneur> {
    Optional<Entrepreneur> findByUser_Id(Long id);

    @Query("SELECT e FROM Entrepreneur e LEFT JOIN FETCH e.businessAreas WHERE e.id = :id")
    Optional<Entrepreneur> findByIdWithBusinessAreas(@Param("id") String id);
}
