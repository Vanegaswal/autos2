package com.example.autos2.entiti;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pagos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Pagoentiti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reservaentiti reserva;

    private BigDecimal monto;
    private LocalDate fechaPago;
    private String metodo;
}
