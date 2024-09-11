package com.jddi.consultas_api.domain.paciente.dto;

import com.jddi.consultas_api.domain.contact.dto.RespuestaEmailDTO;
import com.jddi.consultas_api.domain.contact.dto.RespuestaTelefonoDTO;

public record RespuestaPacienteDTO(
        Long id,
        String nombre,
        String apellido,
        String documento,
        RespuestaEmailDTO emailPrincipal,
        RespuestaTelefonoDTO telefonoPrincipal,
        RespuestaDireccionDTO direccionPrincipal
) {
}
