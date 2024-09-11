package com.jddi.consultas_api.domain.paciente;

import com.jddi.consultas_api.domain.consulta.Consulta;
import com.jddi.consultas_api.domain.paciente.relations.direccion.DireccionPaciente;
import com.jddi.consultas_api.domain.paciente.relations.email.EmailPaciente;
import com.jddi.consultas_api.domain.paciente.relations.telefono.TelefonoPaciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Paciente")
@Table(name = "pacientes")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String documento;
    private Boolean activo;
    @OneToMany(mappedBy = "paciente")
    private List<DireccionPaciente> direcciones;
    @OneToMany(mappedBy = "paciente")
    private List<EmailPaciente> correos;
    @OneToMany(mappedBy = "paciente")
    private List<TelefonoPaciente> telefonos;
    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;
}
