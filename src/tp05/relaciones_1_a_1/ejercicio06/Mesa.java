/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio06;

/**
 *
 * @author nicol
 */
public class Mesa {
    private int numero;
    private int capacidad;
    
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    // Getters y setters
    public int getNumero() { 
        return numero; 
    }
    
    public void setNumero(int numero) { 
        this.numero = numero; 
    }
    
    public int getCapacidad() { 
        return capacidad; 
    }
    
    public void setCapacidad(int capacidad) { 
        this.capacidad = capacidad; 
    }
    
    @Override
    public String toString() {
        return "Mesa{numero=" + numero + ", capacidad=" + capacidad + "}";
    }
}