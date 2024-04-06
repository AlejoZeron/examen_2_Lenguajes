package hn.unah.lenguajes.Examen2.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.Examen2.demo.Entities.direccion;
import hn.unah.lenguajes.Examen2.demo.Services.Impl.direccionServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class direccionController {
    
    @Autowired
    private direccionServicesImpl direccionServicesImpl;


    @PostMapping("/direccion/crear")
    public direccion creaDireccion(@RequestBody direccion direccion) {
        return this.direccionServicesImpl.crearDireccion(direccion);
    }
}
