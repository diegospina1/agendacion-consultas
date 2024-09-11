package com.jddi.consultas_api.domain.doctor.relations.telefono;

import com.jddi.consultas_api.domain.contact.Telefono;
import com.jddi.consultas_api.domain.doctor.Doctor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "TelefonoDoctor")
@Table(name = "telefono_doctores")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TelefonoDoctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Doctor.class)
    private Doctor doctor;
    @ManyToOne(targetEntity = Telefono.class)
    private Telefono telefono;
    private Boolean principal;
}
