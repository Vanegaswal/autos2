package com.example.autos2.Service;

import com.example.autos2.entiti.Clienteentiti;

import java.util.List;
import java.util.Optional;

public interface ICliente  {

    List<Clienteentiti> obtenerTodosLosClientes();
    Optional<Clienteentiti> obtenerClientePorId(Long id);
    Clienteentiti guardarCliente(Clienteentiti cliente);
    void eliminarCliente(Long id);
}
