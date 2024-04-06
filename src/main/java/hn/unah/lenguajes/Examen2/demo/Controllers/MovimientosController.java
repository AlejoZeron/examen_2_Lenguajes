package hn.unah.lenguajes.Examen2.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.Examen2.demo.Entities.Movimientos;
import hn.unah.lenguajes.Examen2.demo.Services.Impl.MovimientosServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class MovimientosController {

    @Autowired
    private MovimientosServicesImpl movimientosServicesImpl;
    

    @PostMapping("/movimientos/crear")
    public Movimientos crearMovimientos(@RequestBody Movimientos movimientos) {
        return this.movimientosServicesImpl.crearMovimientos(movimientos);
    }
}
