package com.example.autos2.Service;

import com.example.autos2.Repository.PagoRepository;
import com.example.autos2.entiti.Pagoentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagosImpl implements IPago {
    @Autowired
    private PagoRepository pagoRepository;

    @Override
    public List<Pagoentiti> obtenerTodosLosPagos() {
        return pagoRepository.findAll();
    }

    @Override
    public Optional<Pagoentiti> obtenerPagoPorId(Long id) {
        return pagoRepository.findById(id);
    }

    @Override
    public Pagoentiti guardarPago(Pagoentiti pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public void eliminarPago(Long id) {
        pagoRepository.deleteById(id);
    }

    @Override
    public List<Pagoentiti> obtenerPagosPorReserva(Long reservaId) {
        return pagoRepository.findAll().stream()
                .filter(pago -> pago.getReserva().getId().equals(reservaId))
                .toList();
    }
}
