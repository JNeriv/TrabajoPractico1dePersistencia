package com.example.TrabajoPractico1dePersistencia;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "DetallePedido")

public class DetallePedido {

    private int cantidad;
    private double subtotal;

    @ManyToOne()
    @JoinColumn(name = "detallePedido_id")
    private Producto producto;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
