/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio07;

/**
 *
 * @author nicol
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Asociacion bidireccional
    
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    // Getters y setters
    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    
    public String getLicencia() { 
        return licencia; 
    }
    
    public void setLicencia(String licencia) { 
        this.licencia = licencia; 
    }
    
    public Vehiculo getVehiculo() { 
        return vehiculo; 
    }
    
    public void setVehiculo(Vehiculo vehiculo) { 
        this.vehiculo = vehiculo; 
    }
    
    @Override
    public String toString() {
        return "Conductor{nombre='" + nombre + "', licencia='" + licencia + "'}";
    }
}