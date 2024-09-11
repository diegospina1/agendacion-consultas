package com.jddi.consultas_api.domain.paciente.relations.email;


import com.jddi.consultas_api.domain.contact.Email;
import com.jddi.consultas_api.domain.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "EmailPaciente")
@Table(name = "email_pacientes")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmailPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Paciente.class)
    private Paciente paciente;
    @ManyToOne(targetEntity = Email.class)
    private Email email;
    private Boolean principal;
}
