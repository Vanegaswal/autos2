package com.example.autos2.Controller;

import com.example.autos2.Service.IReserva;
import com.example.autos2.entiti.Reservaentiti;
import com.example.autos2.entiti.dto.ReservaActivaHoyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/reserva")
public class ReservaController {

    @Autowired
    private IReserva reservaService;

    @GetMapping
    public List<Reservaentiti> listarReservas() {
        return reservaService.obtenerTodasLasReservas();
    }

    @GetMapping("/{id}")
    public Optional<Reservaentiti> obtenerReserva(@PathVariable Long id) {
        return reservaService.obtenerReservaPorId(id);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Reservaentiti> listarPorCliente(@PathVariable Long clienteId) {
        return reservaService.obtenerReservasPorCliente(clienteId);
    }

    @PostMapping
    public Reservaentiti crearReserva(@RequestBody Reservaentiti reserva) {
        return reservaService.guardarReserva(reserva);
    }
    
    @PutMapping("/{id}")
    public Reservaentiti actualizarReserva(@PathVariable Long id, @RequestBody Reservaentiti reserva) {
        reserva.setId(id);
        return reservaService.guardarReserva(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminarReserva(@PathVariable Long id) {
        reservaService.eliminarReserva(id);
    }

    @GetMapping("/activas/hoy")
    public List<ReservaActivaHoyDTO> obtenerReservasActivasHoy() {
        return reservaService.obtenerReservasActivasHoy();
    }
}
