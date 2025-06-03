package com.example.autos2.Repository;

import com.example.autos2.entiti.Reservaentiti;
import com.example.autos2.entiti.dto.ReservaActivaHoyDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reservaentiti,Long> {


    @Query("SELECT new com.example.autos2.entiti.dto.ReservaActivaHoyDTO(" +
            "r.id, r.cliente.nombre, r.vehiculo.placa, r.fechaInicio, r.fechaFin, r.precioTotal) " +
            "FROM Reservaentiti r " +
            "WHERE :hoy BETWEEN r.fechaInicio AND r.fechaFin")
    List<ReservaActivaHoyDTO> obtenerReservasActivasHoy(@Param("hoy") LocalDate hoy);
}
