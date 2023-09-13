package com.example.TrabajoPractico1dePersistencia.repositorios;

import com.example.TrabajoPractico1dePersistencia.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
}
