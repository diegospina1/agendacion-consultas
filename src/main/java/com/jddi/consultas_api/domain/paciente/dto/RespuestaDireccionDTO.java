package com.jddi.consultas_api.domain.paciente.dto;

public record RespuestaDireccionDTO(
        String pais,
        String ciudad,
        String calle,
        String numero,
        String adicional
) {
}
