package com.example.autos2.Repository;

import com.example.autos2.entiti.Sancionentiti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SancionRepository extends JpaRepository<Sancionentiti,Long> {



}
