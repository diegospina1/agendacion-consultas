package com.jddi.consultas_api.domain.contact.mapper;

import com.jddi.consultas_api.domain.contact.Email;
import com.jddi.consultas_api.domain.contact.Telefono;
import com.jddi.consultas_api.domain.contact.dto.CrearEmailDTO;
import com.jddi.consultas_api.domain.contact.dto.CrearTelefonoDTO;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public Telefono mapearTelefono(CrearTelefonoDTO datos){
        return Telefono.builder()
                .telefono(datos.telefono())
                .build();
    }

    public Email mapearEmail(CrearEmailDTO datos){
        return Email.builder()
                .email(datos.email())
                .build();
    }

}
