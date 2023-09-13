package com.example.TrabajoPractico1dePersistencia.repositorios;

import com.example.TrabajoPractico1dePersistencia.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
