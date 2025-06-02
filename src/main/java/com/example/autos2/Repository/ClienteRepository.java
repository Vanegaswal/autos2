package com.example.autos2.Repository;

import com.example.autos2.entiti.Clienteentiti;
import com.example.autos2.entiti.Clienteentiti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Clienteentiti,Long>{

    //Metodo Ordenar Clientes de la A a la Z//
    List<Clienteentiti> findAllByOrderByNombreAsc();


}
