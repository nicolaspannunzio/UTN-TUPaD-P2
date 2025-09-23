/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio02;

/**
 *
 * @author nicol
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Asociacion bidireccional
    
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y setters
    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    
    public String getDni() { 
        return dni; 
    }
    
    public void setDni(String dni) { 
        this.dni = dni; 
    }
    
    public Celular getCelular() { 
        return celular; 
    }
    
    public void setCelular(Celular celular) { 
        this.celular = celular; 
    }
    
    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}