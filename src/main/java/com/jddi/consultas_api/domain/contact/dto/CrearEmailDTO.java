package com.jddi.consultas_api.domain.contact.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CrearEmailDTO(
        @NotBlank(message = "El email es obligatorio")
        @Email(message = "Email no valido")
        String email
) {
}
