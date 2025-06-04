package com.example.autos2.Controller;

import com.example.autos2.Paidload.MessageResponse;
import com.example.autos2.Service.ICliente;
import com.example.autos2.entiti.Clienteentiti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/clientes")

public class ClienteController {
    @Autowired
    private ICliente clienteService;

    @GetMapping
    public ResponseEntity<MessageResponse<List<Clienteentiti>>> listarClientes() {
        List<Clienteentiti> clientes = clienteService.obtenerTodosLosClientes();

        return ResponseEntity.ok(
                MessageResponse.<List<Clienteentiti>>builder()
                        .message("Lista de clientes obtenida exitosamente")
                        .data(clientes)
                        .build()
        );
    }

    //Nuevo Metodo Total De Clientes
    @GetMapping("/total")
    public ResponseEntity<Long> obtenerTotalClientes() {
        long total = clienteService.contarClientes();
        return ResponseEntity.ok(total);
    }

    @GetMapping("/{id}")
    public Optional<Clienteentiti> obtenerCliente(@PathVariable Long id) {
        return clienteService.obtenerClientePorId(id);
    }
    //Nuevo Metodo Ordenar Clientes
    @GetMapping("/ordenados")
    public ResponseEntity<List<Clienteentiti>> obtenerClientesOrdenados() {
        List<Clienteentiti> clientesOrdenados = clienteService.obtenerClientesOrdenadosPorNombre();
        return ResponseEntity.ok(clientesOrdenados);
    }

    @PostMapping
    public Clienteentiti crearCliente(@RequestBody Clienteentiti cliente) {
        return clienteService.guardarCliente(cliente);
    }

    @PutMapping("/{id}")
    public Clienteentiti actualizarCliente(@PathVariable Long id, @RequestBody Clienteentiti cliente) {
        cliente.setId(id);
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
    }


}
