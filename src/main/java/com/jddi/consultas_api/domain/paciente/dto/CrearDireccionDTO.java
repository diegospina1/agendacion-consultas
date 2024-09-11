package com.jddi.consultas_api.domain.paciente.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CrearDireccionDTO(
        @NotBlank(message = "Ciudad es obligatiorio")
        @Pattern(regexp = "^[a-zA-Z]*$", message = "Ciudad invalida")
        String ciudad,
        @NotBlank(message = "Calle es obligatorio")
        @Pattern(regexp = "^[A-Za-z0-9]+$", message = "Calle invalida")
        String calle,
        @NotBlank(message = "Numero es obligatorio")
        @Pattern(regexp = "^\\d{2}-\\d{2}$", message = "Numero invalido")
        String numero,
        @Size(min = 0, max = 255)
        String adicional
) {
}
