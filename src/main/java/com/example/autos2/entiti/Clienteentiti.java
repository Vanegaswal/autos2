package com.example.autos2.entiti;

import jakarta.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "clientes")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Clienteentiti {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String telefono;


}

