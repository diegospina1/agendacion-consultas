package com.jddi.consultas_api.domain.doctor;

import com.jddi.consultas_api.domain.consulta.Consulta;
import com.jddi.consultas_api.domain.doctor.relations.email.EmailDoctor;
import com.jddi.consultas_api.domain.doctor.relations.telefono.TelefonoDoctor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name ="Doctor")
@Table(name = "doctores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    private Boolean activo;
    @OneToMany(mappedBy = "doctor")
    private List<TelefonoDoctor> telefonos;
    @OneToMany(mappedBy = "doctor")
    private List<EmailDoctor> correos;
    @OneToMany(mappedBy = "doctor")
    private List<Consulta> consultas;
}
