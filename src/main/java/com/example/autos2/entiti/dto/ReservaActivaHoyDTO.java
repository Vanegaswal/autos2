package com.example.autos2.entiti.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReservaActivaHoyDTO {
    private Long id;
    private String clienteNombre;
    private String vehiculoPlaca;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private BigDecimal precioTotal;

    public ReservaActivaHoyDTO(Long id, String clienteNombre, String vehiculoPlaca,
                               LocalDate fechaInicio, LocalDate fechaFin, BigDecimal precioTotal) {
        this.id = id;
        this.clienteNombre = clienteNombre;
        this.vehiculoPlaca = vehiculoPlaca;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
    }
    // getters y setters
}
