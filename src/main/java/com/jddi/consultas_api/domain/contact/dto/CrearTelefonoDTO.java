package com.jddi.consultas_api.domain.contact.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CrearTelefonoDTO(
        @NotBlank
        @Pattern(regexp = "^\\d{10}$", message = "Telefono no valido")
        String telefono
) {
}
