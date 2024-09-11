package com.jddi.consultas_api.domain.paciente.relations.direccion;

import com.jddi.consultas_api.domain.paciente.dto.CrearDireccionDTO;
import com.jddi.consultas_api.domain.paciente.dto.RespuestaDireccionDTO;
import org.springframework.stereotype.Component;

@Component
public class DireccionMapper {

    public Direccion mapearDireccion(CrearDireccionDTO datos){
        return Direccion.builder()
                .pais("Colombia")
                .ciudad(datos.ciudad())
                .calle(datos.calle())
                .numero(datos.numero())
                .adicional(datos.adicional())
                .build();
    }

    public RespuestaDireccionDTO mapearRespuestaDireccion(Direccion direccion){
        return new RespuestaDireccionDTO(direccion.getPais(), direccion.getCiudad(), direccion.getCalle(),
                direccion.getNumero(), direccion.getAdicional());
    }
}
