package com.jddi.consultas_api.service;

import com.jddi.consultas_api.domain.paciente.Paciente;
import com.jddi.consultas_api.domain.paciente.PacienteMapper;
import com.jddi.consultas_api.domain.paciente.PacienteRepository;
import com.jddi.consultas_api.domain.paciente.dto.CrearPacienteDTO;
import com.jddi.consultas_api.domain.paciente.dto.RespuestaDireccionDTO;
import com.jddi.consultas_api.domain.paciente.dto.RespuestaPacienteDTO;
import com.jddi.consultas_api.domain.paciente.relations.direccion.Direccion;
import com.jddi.consultas_api.domain.paciente.relations.direccion.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;
    private final ContactService contactService;
    private final DireccionService direccionService;
    private final PacienteMapper mapper;

    @Autowired
    public PacienteService(PacienteRepository repository, ContactService contactService, PacienteMapper mapper, DireccionService direccionService) {
        this.pacienteRepository = repository;
        this.contactService = contactService;
        this.mapper = mapper;
        this.direccionService = direccionService;
    }

    public RespuestaPacienteDTO crear(CrearPacienteDTO datos){
        Paciente paciente = pacienteRepository.save(mapper.mapearPaciente(datos));
        return mapper.mapearRespuestaPaciente(paciente, direccionService.crearDireccion(datos.direccion()),
                contactService.crearTelefono(datos.telefono()), contactService.crearEmail(datos.email()));
    }

}
