package com.tcc.entrepreneur.dto;

import lombok.Data;

@Data
public class ResponseEntrepreneurDto {

    private String id;
    private String companyName;
    private String description;
    private String email;
    private String phone;
    private String businessArea;
}
