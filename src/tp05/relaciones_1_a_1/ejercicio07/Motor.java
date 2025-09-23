/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio07;

/**
 *
 * @author nicol
 */
public class Motor {
    private String tipo;
    private String numeroSerie;
    
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
    // Getters y setters
    public String getTipo() { 
        return tipo; 
    }
    
    public void setTipo(String tipo) { 
        this.tipo = tipo; 
    }
    
    public String getNumeroSerie() { 
        return numeroSerie; 
    }
    
    public void setNumeroSerie(String numeroSerie) { 
        this.numeroSerie = numeroSerie; 
    }
    
    @Override
    public String toString() {
        return "Motor{tipo='" + tipo + "', numeroSerie='" + numeroSerie + "'}";
    }
}
