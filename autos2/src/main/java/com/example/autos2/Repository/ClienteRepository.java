package com.example.autos2.Repository;

import com.example.autos2.entiti.Clienteentiti;
import com.example.autos2.entiti.Clienteentiti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Clienteentiti,Long>{
}
