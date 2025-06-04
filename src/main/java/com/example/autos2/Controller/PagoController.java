package com.example.autos2.Controller;

import com.example.autos2.Paidload.MessageResponse;
import com.example.autos2.Service.IPago;
import com.example.autos2.entiti.Pagoentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pagos")

public class PagoController {
    @Autowired
    private IPago pagoService;

    @GetMapping
    public ResponseEntity<MessageResponse<List<Pagoentiti>>> listarPagos() {
        List<Pagoentiti> pagos = pagoService.obtenerTodosLosPagos();

        return ResponseEntity.ok(
                MessageResponse.<List<Pagoentiti>>builder()
                        .message("Lista de pagos obtenida exitosamente")
                        .data(pagos)
                        .build()
        );
    }

    @GetMapping("/{id}")
    public Optional<Pagoentiti> obtenerPago(@PathVariable Long id) {
        return pagoService.obtenerPagoPorId(id);
    }

    @GetMapping("/reserva/{reservaId}")
    public List<Pagoentiti> listarPagosPorReserva(@PathVariable Long reservaId) {
        return pagoService.obtenerPagosPorReserva(reservaId);
    }

    @PostMapping
    public Pagoentiti crearPago(@RequestBody Pagoentiti pago) {
        return pagoService.guardarPago(pago);
    }

    @PutMapping("/{id}")
    public Pagoentiti actualizarPago(@PathVariable Long id, @RequestBody Pagoentiti pago) {
        pago.setId(id);
        return pagoService.guardarPago(pago);
    }

    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable Long id) {
        pagoService.eliminarPago(id);
    }
}
