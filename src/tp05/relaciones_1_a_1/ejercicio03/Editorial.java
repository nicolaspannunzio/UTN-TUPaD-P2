/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio03;

/**
 *
 * @author nicol
 */
public class Editorial {
    private String nombre;
    private String direccion;
    
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    // Getters y setters
    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    
    public String getDireccion() { 
        return direccion; 
    }
    
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }
    
    @Override
    public String toString() {
        return "Editorial{nombre='" + nombre + "', direccion='" + direccion + "'}";
    }
}
