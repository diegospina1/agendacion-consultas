package com.jddi.consultas_api.controller;

import com.jddi.consultas_api.domain.paciente.dto.CrearPacienteDTO;
import com.jddi.consultas_api.domain.paciente.dto.RespuestaPacienteDTO;
import com.jddi.consultas_api.service.PacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    private PacienteService service;

    @Autowired
    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RespuestaPacienteDTO> crearPaciente(@RequestBody @Valid CrearPacienteDTO datos){
        return ResponseEntity.ok(service.crear(datos));
    }
}
