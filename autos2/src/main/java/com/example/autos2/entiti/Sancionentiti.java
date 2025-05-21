package com.example.autos2.entiti;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "sanciones")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

public class Sancionentiti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clienteentiti cliente;

    private String motivo;
    private BigDecimal monto;
    private LocalDate fecha;
}
