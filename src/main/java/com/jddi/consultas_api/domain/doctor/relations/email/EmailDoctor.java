package com.jddi.consultas_api.domain.doctor.relations.email;

import com.jddi.consultas_api.domain.contact.Email;
import com.jddi.consultas_api.domain.doctor.Doctor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "EmailDoctor")
@Table(name = "email_doctores")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmailDoctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Doctor.class)
    private Doctor doctor;
    @ManyToOne(targetEntity = Email.class)
    private Email email;
    private Boolean principal;
}
