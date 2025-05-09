package com.example.autos2.entiti;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "reservas")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Reservaentiti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clienteentiti cliente;

    @ManyToOne
    @JoinColumn(name = "vehiculo_id")
    private Vehiculosentiti vehiculo;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private BigDecimal precioTotal;

    public static List<Reservaentiti> obtenerTodasLasReservas() {return null;
    }
}
