package com.jddi.consultas_api.domain.paciente.dto;

import com.jddi.consultas_api.domain.contact.dto.CrearTelefonoDTO;
import com.jddi.consultas_api.domain.contact.dto.CrearEmailDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record CrearPacienteDTO(
        @NotBlank(message = "El nombre es obligatorio")
        String nombre,
        @NotBlank(message = "El apellido es obligatorio")
        String apellido,
        @NotBlank(message = "El documento es obligatorio")
        @Size(min = 10, max = 10)
        String documento,
        @Valid
        CrearEmailDTO email,
        @Valid
        CrearTelefonoDTO telefono,
        @Valid
        CrearDireccionDTO direccion
) {
}
