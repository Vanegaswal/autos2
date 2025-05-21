package com.example.autos2.Service;

import com.example.autos2.entiti.Vehiculosentiti;

import java.util.List;
import java.util.Optional;

public interface IVehiculo {
    List<Vehiculosentiti> obtenerTodosLosVehiculos();
    Optional<Vehiculosentiti> obtenerVehiculoPorId(Long id);
    Vehiculosentiti guardarVehiculo(Vehiculosentiti vehiculo);
    void eliminarVehiculo(Long id);
    List<Vehiculosentiti> obtenerVehiculosDisponibles();
}
