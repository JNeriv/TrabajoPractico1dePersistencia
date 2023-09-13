package com.example.TrabajoPractico1dePersistencia.repositorios;

import com.example.TrabajoPractico1dePersistencia.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
