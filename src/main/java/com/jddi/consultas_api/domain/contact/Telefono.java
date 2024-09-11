package com.jddi.consultas_api.domain.contact;

import com.jddi.consultas_api.domain.doctor.relations.telefono.TelefonoDoctor;
import com.jddi.consultas_api.domain.paciente.relations.telefono.TelefonoPaciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Telefono")
@Table(name = "telefonos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefono;
    @OneToMany(mappedBy = "telefono")
    private List<TelefonoPaciente> asociacionesPaciente;
    @OneToMany(mappedBy = "telefono")
    private List<TelefonoDoctor> asociacionesDoctor;
}
