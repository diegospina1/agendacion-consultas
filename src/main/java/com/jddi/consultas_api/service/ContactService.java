package com.jddi.consultas_api.service;

import com.jddi.consultas_api.domain.contact.Telefono;
import com.jddi.consultas_api.domain.contact.dto.CrearEmailDTO;
import com.jddi.consultas_api.domain.contact.dto.CrearTelefonoDTO;
import com.jddi.consultas_api.domain.contact.dto.RespuestaEmailDTO;
import com.jddi.consultas_api.domain.contact.dto.RespuestaTelefonoDTO;
import com.jddi.consultas_api.domain.contact.mapper.ContactMapper;
import com.jddi.consultas_api.domain.contact.repository.EmailRepository;
import com.jddi.consultas_api.domain.contact.repository.TelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final TelefonoRepository telefonoRepository;
    private final EmailRepository emailRepository;
    private final ContactMapper mapper;

    @Autowired
    public ContactService(TelefonoRepository telefonoRepository, EmailRepository emailRepository, ContactMapper mapper) {
        this.telefonoRepository = telefonoRepository;
        this.emailRepository = emailRepository;
        this.mapper = mapper;
    }

    public RespuestaTelefonoDTO crearTelefono(CrearTelefonoDTO datos){
        telefonoRepository.save(mapper.mapearTelefono(datos));
        return new RespuestaTelefonoDTO(datos.telefono());
    }

    public RespuestaEmailDTO crearEmail(CrearEmailDTO datos){
        emailRepository.save(mapper.mapearEmail(datos));
        return new RespuestaEmailDTO(datos.email());
    }
}
