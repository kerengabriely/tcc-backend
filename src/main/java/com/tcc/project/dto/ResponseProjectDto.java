package com.tcc.project.dto;


import com.tcc.entrepreneur.dto.ResponseEntrepreneurProjectDto;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ResponseProjectDto {

    private String id;
    private ResponseEntrepreneurProjectDto entrepreneur;
    private String title;
    private String description;
    private String requirements;
    private String status;
    private String creationDate;
    private LocalDate deadLine;
}