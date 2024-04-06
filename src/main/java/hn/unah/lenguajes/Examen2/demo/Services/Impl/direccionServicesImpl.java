package hn.unah.lenguajes.Examen2.demo.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Examen2.demo.Entities.direccion;
import hn.unah.lenguajes.Examen2.demo.Repositories.direccionRepository;
import hn.unah.lenguajes.Examen2.demo.Services.direccionServices;

@Service
public class direccionServicesImpl implements direccionServices{

    @Autowired
    private direccionRepository direccionRepository;

    @Override
    public direccion crearDireccion(direccion direccion) {
        return this.direccionRepository.save(direccion);
    }
    
}
