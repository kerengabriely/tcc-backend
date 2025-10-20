package com.tcc.application.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class CreateApplicationDto {

    @NotBlank(message = "A ideia é obrigatória.")

    private String idea;

    @NotNull(message = "O valor é obrigatório.")
    @Positive(message = "O valor deve ser positivo.")
    private Double value;

    @NotBlank(message = "O ID do projeto é obrigatório.")
    private String idProject;
}
