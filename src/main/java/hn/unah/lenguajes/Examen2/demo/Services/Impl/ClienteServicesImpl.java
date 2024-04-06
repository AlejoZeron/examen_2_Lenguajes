package hn.unah.lenguajes.Examen2.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Examen2.demo.Entities.Cliente;
import hn.unah.lenguajes.Examen2.demo.Repositories.ClienteRepository;
import hn.unah.lenguajes.Examen2.demo.Services.ClienteServices;

@Service
public class ClienteServicesImpl implements ClienteServices{

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>)this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorDni(String dni) {
        return this.clienteRepository.findById(dni).get();
    }
    
}
