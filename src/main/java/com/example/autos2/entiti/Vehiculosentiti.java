package com.example.autos2.entiti;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vehiculos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

public class Vehiculosentiti
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private String placa;
    private Boolean disponible = true;
}
