package com.jddi.consultas_api.service;

import com.jddi.consultas_api.domain.paciente.dto.CrearDireccionDTO;
import com.jddi.consultas_api.domain.paciente.dto.RespuestaDireccionDTO;
import com.jddi.consultas_api.domain.paciente.relations.direccion.Direccion;
import com.jddi.consultas_api.domain.paciente.relations.direccion.DireccionMapper;
import com.jddi.consultas_api.domain.paciente.relations.direccion.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionService {

    private final DireccionRepository direccionRepository;
    private final DireccionMapper mapper;

    @Autowired
    public DireccionService(DireccionRepository direccionRepository, DireccionMapper mapper) {
        this.direccionRepository = direccionRepository;
        this.mapper = mapper;
    }

    public RespuestaDireccionDTO crearDireccion(CrearDireccionDTO datos){
        Direccion direccion = direccionRepository.save(mapper.mapearDireccion(datos));
        return mapper.mapearRespuestaDireccion(direccion);
    }
}
