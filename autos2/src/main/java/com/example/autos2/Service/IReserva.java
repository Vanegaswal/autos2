package com.example.autos2.Service;

import com.example.autos2.entiti.Reservaentiti;

import java.util.List;
import java.util.Optional;

public interface IReserva {

    List<Reservaentiti> obtenerTodasLasReservas();
    Optional<Reservaentiti> obtenerReservaPorId(Long id);
    Reservaentiti guardarReserva(Reservaentiti reserva);
    void eliminarReserva(Long id);
    List<Reservaentiti> obtenerReservasPorCliente(Long clienteId);
}
