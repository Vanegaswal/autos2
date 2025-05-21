package com.example.autos2.Service;

import com.example.autos2.entiti.Pagoentiti;

import java.util.List;
import java.util.Optional;

public interface IPago {

    List<Pagoentiti> obtenerTodosLosPagos();
    Optional<Pagoentiti> obtenerPagoPorId(Long id);
    Pagoentiti guardarPago(Pagoentiti pago);
    void eliminarPago(Long id);
    List<Pagoentiti> obtenerPagosPorReserva(Long reservaId);
}

