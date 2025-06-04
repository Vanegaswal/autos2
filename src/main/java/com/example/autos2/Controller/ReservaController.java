package com.example.autos2.Controller;

import com.example.autos2.Paidload.MessageResponse;
import com.example.autos2.Service.IReserva;
import com.example.autos2.entiti.Reservaentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/reserva")
public class ReservaController {

    @Autowired
    private IReserva reservaService;

    @GetMapping
    public ResponseEntity<MessageResponse<List<Reservaentiti>>> listarReservas() {
        List<Reservaentiti> reservas = reservaService.obtenerTodasLasReservas();

        return ResponseEntity.ok(
                MessageResponse.<List<Reservaentiti>>builder()
                        .message("Lista de reservas obtenida exitosamente")
                        .data(reservas)
                        .build()
        );
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
}
