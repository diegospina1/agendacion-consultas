package com.jddi.consultas_api.domain.contact;

import com.jddi.consultas_api.domain.doctor.relations.email.EmailDoctor;
import com.jddi.consultas_api.domain.paciente.relations.email.EmailPaciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Email")
@Table(name = "email")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    @OneToMany(mappedBy = "email")
    private List<EmailPaciente> asociacionesPaciente;
    @OneToMany(mappedBy = "email")
    private List<EmailDoctor> asociacionesDoctor;
}
