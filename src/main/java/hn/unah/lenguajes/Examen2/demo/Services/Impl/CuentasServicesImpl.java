package hn.unah.lenguajes.Examen2.demo.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Examen2.demo.Entities.Cuentas;
import hn.unah.lenguajes.Examen2.demo.Repositories.CuentasRepository;
import hn.unah.lenguajes.Examen2.demo.Services.CuentasServices;

@Service
public class CuentasServicesImpl implements CuentasServices{

    @Autowired
    private CuentasRepository cuentasRepository;

    @Override
    public Cuentas crearCuentas(Cuentas cuentas) {
        return this.cuentasRepository.save(cuentas);
    }

    @Override
    public Cuentas asociarcuentaCliente(Cuentas numerocuenta) {
        return this.cuentasRepository.save(numerocuenta);

    }
    
}
