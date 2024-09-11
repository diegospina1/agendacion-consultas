package com.jddi.consultas_api.domain.paciente.relations.telefono;

import com.jddi.consultas_api.domain.contact.Telefono;
import com.jddi.consultas_api.domain.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "TelefonoPaciente")
@Table(name = "telefono_pacientes")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TelefonoPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Paciente.class)
    private Paciente paciente;
    @ManyToOne(targetEntity = Telefono.class)
    private Telefono telefono;
    private Boolean principal;
}
