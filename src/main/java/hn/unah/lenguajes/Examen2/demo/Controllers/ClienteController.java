package hn.unah.lenguajes.Examen2.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.Examen2.demo.Entities.Cliente;
import hn.unah.lenguajes.Examen2.demo.Services.Impl.ClienteServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/")
public class ClienteController {
    
    @Autowired
    private ClienteServicesImpl clienteServicesImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServicesImpl.crearCliente(cliente);
    }

    @GetMapping("/Clientes/obtener")
    public List<Cliente> obtenerClientes() {
        return this.clienteServicesImpl.obtenerClientes();
    }

    @GetMapping("/Cliente/ObtenerPorDni")
    public Cliente obtenerClientePorDni(@RequestParam(name="id") String dni) {
        return this.clienteServicesImpl.obtenerClientePorDni(dni);
    }
    

}
