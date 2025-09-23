/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio07;

/**
 *
 * @author nicol
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;    // Asociacion bidireccional
    private Motor motor;            // Agregacion
    
    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }
    
    // Metodo para establecer la relacion bidireccional con conductor
    public void setConductor(Conductor conductor) {
        // Si ya tenia un conductor, le quitamos la referencia
        if (this.conductor != null) {
            this.conductor.setVehiculo(null);
        }
        
        this.conductor = conductor;
        
        // Establecemos la relacion bidireccional
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }
    
    // Getters y setters
    public String getPatente() { 
        return patente; 
    }
    
    public void setPatente(String patente) { 
        this.patente = patente; 
    }
    
    public String getModelo() { 
        return modelo; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    
    public Conductor getConductor() { 
        return conductor; 
    }
    
    public Motor getMotor() { 
        return motor; 
    }
    
    public void setMotor(Motor motor) { 
        this.motor = motor; 
    }
    
    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo + 
               "', conductor=" + (conductor != null ? conductor.getNombre() : "sin conductor") + 
               ", motor=" + (motor != null ? motor.getTipo() : "sin motor") + "}";
    }
}
