package hn.unah.lenguajes.Examen2.demo.Entities;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "movimientos")
@Data
public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    private int idMovimiento;

    @Column(name ="tipomovimiento")
    private char tipoMovimeinto;

    private double monto;

    private Date fechaMovimiento;

    @ManyToOne
    @JoinColumn(name ="numerocuenta", referencedColumnName = "numerocuenta")
    private Cuentas cuentas;
}
