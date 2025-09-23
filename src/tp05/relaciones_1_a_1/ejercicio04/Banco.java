/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio04;

/**
 *
 * @author nicol
 */
public class Banco {
    private String nombre;
    private String cuit;
    
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    // Getters y setters
    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    
    public String getCuit() { 
        return cuit; 
    }
    
    public void setCuit(String cuit) { 
        this.cuit = cuit; 
    }
    
    @Override
    public String toString() {
        return "Banco{nombre='" + nombre + "', cuit='" + cuit + "'}";
    }
}