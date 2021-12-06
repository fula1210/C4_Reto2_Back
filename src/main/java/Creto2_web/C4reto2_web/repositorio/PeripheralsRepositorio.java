/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creto2_web.C4reto2_web.repositorio;

import Creto2_web.C4reto2_web.modelo.Peripherals;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Creto2_web.C4reto2_web.interfaces.InterfacePeripherals;

/**
 *
 * @author PRESTAMO
 */


@Repository
public class PeripheralsRepositorio {
  @Autowired
    private InterfacePeripherals repository;

    public List<Peripherals> getAll() {
        return repository.findAll();
    }
public Optional<Peripherals> getClothe(String reference) {
        return repository.findById(reference);
    }
    
    public Peripherals create(Peripherals clothe) {
        return repository.save(clothe);
    }

    public void update(Peripherals clothe) {
        repository.save(clothe);
    }
    
    public void delete(Peripherals clothe) {
        repository.delete(clothe);
    }
}
