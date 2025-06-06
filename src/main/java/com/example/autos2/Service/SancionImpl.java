package com.example.autos2.Service;

import com.example.autos2.Repository.SancionRepository;
import com.example.autos2.entiti.Sancionentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SancionImpl implements ISancion {

    @Autowired
    private SancionRepository sancionRepository;

    @Override
    public List<Sancionentiti> obtenerTodasLasSanciones() {
        return sancionRepository.findAll();
    }

    @Override
    public Optional<Sancionentiti> obtenerSancionPorId(Long id) {
        return sancionRepository.findById(id);
    }

    @Override
    public Sancionentiti guardarSancion(Sancionentiti sancion) {
        return sancionRepository.save(sancion);
    }

    @Override
    public void eliminarSancion(Long id) {
        sancionRepository.deleteById(id);
    }

    @Override
    public List<Sancionentiti> obtenerSancionesOrdenadas() {
        return sancionRepository.findAllByOrderByFechaDesc();
    }


    @Override
    public List<Sancionentiti> obtenerSancionesPorCliente(Long clienteId) {
        return sancionRepository.findAll().stream()
                .filter(sancion -> sancion.getCliente() != null && sancion.getCliente().getId().equals(clienteId))
                .collect(Collectors.toList());
    }
}
