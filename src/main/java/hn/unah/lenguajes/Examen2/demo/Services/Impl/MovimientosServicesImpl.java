package hn.unah.lenguajes.Examen2.demo.Services.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Examen2.demo.Entities.Movimientos;
import hn.unah.lenguajes.Examen2.demo.Repositories.MovimientosRepository;
import hn.unah.lenguajes.Examen2.demo.Services.MovimientosServices;

@Service
public class MovimientosServicesImpl implements MovimientosServices{

    @Autowired
    private MovimientosRepository movimientosRepository;

    @Override
    public Movimientos crearMovimientos(Movimientos movimientos) {
        return this.movimientosRepository.save(movimientos);
    }

    @Override
    public Optional<Movimientos> obtenerMovimientosPorCuenta(Integer dni) {
        return this.movimientosRepository.findById(dni);
    }
    
}
