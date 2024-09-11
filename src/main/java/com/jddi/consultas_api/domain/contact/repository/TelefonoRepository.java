package com.jddi.consultas_api.domain.contact.repository;

import com.jddi.consultas_api.domain.contact.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonoRepository extends JpaRepository<Telefono, Long> {
}
