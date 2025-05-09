package com.example.autos2.Repository;

import com.example.autos2.entiti.Reservaentiti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reservaentiti,Long> {
}
