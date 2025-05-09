package com.example.autos2.Service;

import com.example.autos2.Repository.ReservaRepository;
import com.example.autos2.entiti.Reservaentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaImpl implements IReserva {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reservaentiti> obtenerTodasLasReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Optional<Reservaentiti> obtenerReservaPorId(Long id) {
        return reservaRepository.findById(id);
    }

    @Override
    public Reservaentiti guardarReserva(Reservaentiti reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }

    @Override
    public List<Reservaentiti> obtenerReservasPorCliente(Long clienteId) {
        return reservaRepository.findAll().stream()
                .filter(reserva -> reserva.getCliente().getId().equals(clienteId))
                .toList();
    }
}
