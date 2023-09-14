package com.example.TrabajoPractico1dePersistencia;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Factura")

public class Factura {
    private int numero;
    private LocalDate fecha;
    private double descuento;
    private String formaPago;
    private int total;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
