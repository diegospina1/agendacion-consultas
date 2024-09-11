package com.jddi.consultas_api.domain.consulta;

import com.jddi.consultas_api.domain.doctor.Doctor;
import com.jddi.consultas_api.domain.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name ="Consulta")
@Table(name = "consultas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Paciente.class)
    private Paciente paciente;
    @ManyToOne(targetEntity = Doctor.class)
    private Doctor doctor;
    private LocalDateTime fecha;
    @Enumerated(EnumType.STRING)
    private Sede sede;
    private Boolean cancelada;

}
