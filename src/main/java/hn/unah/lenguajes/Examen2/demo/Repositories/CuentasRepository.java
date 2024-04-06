package hn.unah.lenguajes.Examen2.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.Examen2.demo.Entities.Cuentas;

@Repository
public interface CuentasRepository extends CrudRepository<Cuentas, String>{
    
}
