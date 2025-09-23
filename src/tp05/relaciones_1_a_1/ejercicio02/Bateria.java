/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp05.relaciones_1_a_1.ejercicio02;

/**
 *
 * @author nicol
 */
public class Bateria {
    private String modelo;
    private String capacidad;
    
    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    // Getters y setters
    public String getModelo() { 
        return modelo; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    
    public String getCapacidad() { 
        return capacidad; 
    }
    
    public void setCapacidad(String capacidad) { 
        this.capacidad = capacidad; 
    }
    
    @Override
    public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidad='" + capacidad + "'}";
    }
}
