package hn.unah.lenguajes.Examen2.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.Examen2.demo.Entities.Cuentas;
import hn.unah.lenguajes.Examen2.demo.Services.Impl.CuentasServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class CuentasController {
    
    @Autowired
    private CuentasServicesImpl cuentasServicesImpl;

    @PostMapping("/cuenta/crear")
    public Cuentas crearCliente(@RequestBody Cuentas cuentas) {
        return this.cuentasServicesImpl.crearCuentas(cuentas);
    }

    @PostMapping("/cuenta/asociar")
    public Cuentas asociarcuentaCliente(@RequestBody Cuentas numerocuenta ) {
        return this.cuentasServicesImpl.asociarcuentaCliente(numerocuenta);
    }
    

}
