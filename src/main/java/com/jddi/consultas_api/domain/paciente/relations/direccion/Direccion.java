package com.jddi.consultas_api.domain.paciente.relations.direccion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Direccion")
@Table(name = "direcciones")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pais;
    private String ciudad;
    private String calle;
    private String numero;
    private String adicional;
    @OneToMany
    private List<DireccionPaciente> asociaciones;
}
