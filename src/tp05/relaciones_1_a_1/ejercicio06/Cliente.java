/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio06;

/**
 *
 * @author nicol
 */
public class Cliente {
    private String nombre;
    private String telefono;
    
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    // Getters y setters
    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    
    public String getTelefono() { 
        return telefono; 
    }
    
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }
    
    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', telefono='" + telefono + "'}";
    }
}