package com.example.autos2.Service;

import com.example.autos2.entiti.Sancionentiti;

import java.util.List;
import java.util.Optional;

public interface ISancion {

    List<Sancionentiti> obtenerTodasLasSanciones();
    Optional<Sancionentiti> obtenerSancionPorId(Long id);
    Sancionentiti guardarSancion(Sancionentiti sancion);
    void eliminarSancion(Long id);
    List<Sancionentiti> obtenerSancionesPorCliente(Long clienteId);
}
