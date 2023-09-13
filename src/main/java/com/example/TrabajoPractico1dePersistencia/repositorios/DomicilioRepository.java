package com.example.TrabajoPractico1dePersistencia.repositorios;

import com.example.TrabajoPractico1dePersistencia.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}
