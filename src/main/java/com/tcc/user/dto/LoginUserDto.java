package com.tcc.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginUserDto {
    @NotBlank(message = "O e-mail não pode estar em branco.")
    @Email(message = "Formato de e-mail inválido.")
    private String email;

    @NotBlank(message = "A senha não pode estar em branco.")
    private String password;
}