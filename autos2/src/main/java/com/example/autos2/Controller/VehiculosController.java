package com.example.autos2.Controller;


import com.example.autos2.Service.IVehiculo;
import com.example.autos2.entiti.Vehiculosentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculosController {

    @Autowired
    private IVehiculo vehiculoService;

    @GetMapping
    public List<Vehiculosentiti> listarVehiculos() {
        return vehiculoService.obtenerTodosLosVehiculos();
    }

    @GetMapping("/disponibles")
    public List<Vehiculosentiti> listarDisponibles() {
        return vehiculoService.obtenerVehiculosDisponibles();
    }

    @GetMapping("/{id}")
    public Optional<Vehiculosentiti> obtenerVehiculo(@PathVariable Long id) {
        return vehiculoService.obtenerVehiculoPorId(id);
    }

    @PostMapping
    public Vehiculosentiti crearVehiculo(@RequestBody Vehiculosentiti vehiculo) {
        return vehiculoService.guardarVehiculo(vehiculo);
    }

    @PutMapping("/{id}")
    public Vehiculosentiti actualizarVehiculo(@PathVariable Long id, @RequestBody Vehiculosentiti vehiculo) {
        vehiculo.setId(id);
        return vehiculoService.guardarVehiculo(vehiculo);
    }

    @DeleteMapping("/{id}")
    public void eliminarVehiculo(@PathVariable Long id) {
        vehiculoService.eliminarVehiculo(id);
    }
}
