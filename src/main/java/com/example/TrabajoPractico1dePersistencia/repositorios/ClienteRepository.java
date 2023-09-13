package com.example.TrabajoPractico1dePersistencia.repositorios;

import com.example.TrabajoPractico1dePersistencia.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
