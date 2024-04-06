package hn.unah.lenguajes.Examen2.demo.Services;

import java.util.List;

import hn.unah.lenguajes.Examen2.demo.Entities.Cliente;

public interface ClienteServices {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente obtenerClientePorDni(String dni); 
}
