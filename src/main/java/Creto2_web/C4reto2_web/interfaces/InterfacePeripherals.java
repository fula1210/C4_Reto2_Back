/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creto2_web.C4reto2_web.interfaces;


import Creto2_web.C4reto2_web.modelo.Peripherals;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author PRESTAMO
 */
public interface InterfacePeripherals extends MongoRepository<Peripherals, String> {
    
}
