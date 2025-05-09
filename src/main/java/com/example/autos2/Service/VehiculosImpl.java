package com.example.autos2.Service;


import com.example.autos2.Repository.VehiculosRepository;
import com.example.autos2.entiti.Vehiculosentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculosImpl implements IVehiculo {
    @Autowired
    private VehiculosRepository vehiculoRepository;

    @Override
    public List<Vehiculosentiti> obtenerTodosLosVehiculos() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Optional<Vehiculosentiti> obtenerVehiculoPorId(Long id) {
        return vehiculoRepository.findById(id);
    }

    @Override
    public Vehiculosentiti guardarVehiculo(Vehiculosentiti vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public void eliminarVehiculo(Long id) {
        vehiculoRepository.deleteById(id);
    }

    @Override
    public List<Vehiculosentiti> obtenerVehiculosDisponibles() {
        return vehiculoRepository.findAll().stream()
                .filter(Vehiculosentiti::getDisponible)
                .toList();
    }
}
