package com.example.autos2.Controller;

import com.example.autos2.Service.ISancion;
import com.example.autos2.entiti.Sancionentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/sancion")
public class SancionController {
    @Autowired
    private ISancion sancionService;

    @GetMapping
    public List<Sancionentiti> listarSanciones() {
        return sancionService.obtenerTodasLasSanciones();
    }

    @GetMapping("/{id}")
    public Optional<Sancionentiti> obtenerSancion(@PathVariable Long id) {
        return sancionService.obtenerSancionPorId(id);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Sancionentiti> listarSancionesPorCliente(@PathVariable Long clienteId) {
        return sancionService.obtenerSancionesPorCliente(clienteId);
    }

    @PostMapping
    public Sancionentiti crearSancion(@RequestBody Sancionentiti sancion) {
        return sancionService.guardarSancion(sancion);
    }

    @PutMapping("/{id}")
    public Sancionentiti actualizarSancion(@PathVariable Long id, @RequestBody Sancionentiti sancion) {
        sancion.setId(id);
        return sancionService.guardarSancion(sancion);
    }

    @DeleteMapping("/{id}")
    public void eliminarSancion(@PathVariable Long id) {
        sancionService.eliminarSancion(id);
    }
}
