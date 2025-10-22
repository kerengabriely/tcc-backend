package com.tcc.entrepreneur.usecase;

import com.tcc.entrepreneur.adapter.repository.EntrepreneurRepository;
import com.tcc.entrepreneur.entity.Entrepreneur;
import com.tcc.entrepreneur.specification.EntrepreneurSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetByIdEntrepreneurUseCase {

    private final EntrepreneurRepository repository;

    public Entrepreneur execute(String id) {
        return repository.findByIdWithBusinessAreas(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entrepreneur not found."));
    }
}
