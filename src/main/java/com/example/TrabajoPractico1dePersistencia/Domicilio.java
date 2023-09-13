package com.example.TrabajoPractico1dePersistencia;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Domicilio")

public class Domicilio {
    private String calle;
    private String numero;
    private String localidad;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
