package com.example.autos2.Service;


import com.example.autos2.Repository.ClienteRepository;
import com.example.autos2.entiti.Clienteentiti;

import com.example.autos2.Service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Clienteentiti> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Clienteentiti> obtenerClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Clienteentiti guardarCliente(Clienteentiti cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
