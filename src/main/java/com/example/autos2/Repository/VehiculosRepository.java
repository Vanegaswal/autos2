package com.example.autos2.Repository;


import com.example.autos2.entiti.Vehiculosentiti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculosRepository extends JpaRepository<Vehiculosentiti, Long> {
}
