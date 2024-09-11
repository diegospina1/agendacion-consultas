package com.jddi.consultas_api.domain.paciente.relations.direccion;

import com.jddi.consultas_api.domain.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "DireccionPaciente")
@Table(name = "direccion_pacientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DireccionPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Paciente.class)
    private Paciente paciente;
    @ManyToOne(targetEntity = Direccion.class)
    private Direccion direccion;
    private Boolean principal;

}
