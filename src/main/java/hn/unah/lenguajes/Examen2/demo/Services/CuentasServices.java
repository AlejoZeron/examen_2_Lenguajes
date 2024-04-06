package hn.unah.lenguajes.Examen2.demo.Services;

import hn.unah.lenguajes.Examen2.demo.Entities.Cuentas;

public interface CuentasServices {
    
    public Cuentas crearCuentas(Cuentas cuentas);

    public Cuentas asociarcuentaCliente(Cuentas numerocuenta);
}
