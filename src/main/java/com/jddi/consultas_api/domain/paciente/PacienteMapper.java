package com.jddi.consultas_api.domain.paciente;

import com.jddi.consultas_api.domain.contact.dto.RespuestaEmailDTO;
import com.jddi.consultas_api.domain.contact.dto.RespuestaTelefonoDTO;
import com.jddi.consultas_api.domain.paciente.dto.CrearDireccionDTO;
import com.jddi.consultas_api.domain.paciente.dto.CrearPacienteDTO;
import com.jddi.consultas_api.domain.paciente.dto.RespuestaDireccionDTO;
import com.jddi.consultas_api.domain.paciente.dto.RespuestaPacienteDTO;
import com.jddi.consultas_api.domain.paciente.relations.direccion.Direccion;
import org.springframework.stereotype.Component;

@Component
public class PacienteMapper {

    public Paciente mapearPaciente(CrearPacienteDTO datos){
        return Paciente.builder()
                .nombre(datos.nombre())
                .apellido(datos.apellido())
                .documento(datos.documento())
                .activo(true)
                .build();
    }

    public RespuestaPacienteDTO mapearRespuestaPaciente(Paciente paciente, RespuestaDireccionDTO direccion,
                                                        RespuestaTelefonoDTO telefono, RespuestaEmailDTO email){
        return new RespuestaPacienteDTO(paciente.getId(), paciente.getNombre(), paciente.getApellido(), paciente.getDocumento(),
                email, telefono, direccion);
    }

}
