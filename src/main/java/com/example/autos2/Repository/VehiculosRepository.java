package com.example.autos2.Repository;


import com.example.autos2.entiti.Vehiculosentiti;
import com.example.autos2.entiti.dto.Vehiculosxmarca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehiculosRepository extends JpaRepository<Vehiculosentiti, Long> {

    @Query("SELECT new com.example.autos2.entiti.dto.Vehiculosxmarca(v.marca, COUNT(v))"
    + "from Vehiculosentiti v GROUP BY v.marca")
   List<Vehiculosxmarca> contarvehiculosxmarca();
}
