package com.example.autos2.Repository;

import com.example.autos2.entiti.Pagoentiti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pagoentiti,Long> {
}
