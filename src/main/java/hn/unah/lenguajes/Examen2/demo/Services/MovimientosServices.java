package hn.unah.lenguajes.Examen2.demo.Services;

import hn.unah.lenguajes.Examen2.demo.Entities.Movimientos;

public interface MovimientosServices {

    public Movimientos crearMovimientos(Movimientos movimientos);

    public Movimientos obtenerMovimientosPorCuenta(String dni); 
} 