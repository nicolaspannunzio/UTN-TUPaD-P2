/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio05;

/**
 *
 * @author nicol
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;    // Asociacion bidireccional
    private PlacaMadre placaMadre;      // Composicion
    
    public Computadora(String marca, String numeroSerie) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // La placa madre se crea junto con la computadora (composicion)
        this.placaMadre = new PlacaMadre("MB-" + numeroSerie.substring(0, 6), "Intel Z690");
    }
    
    // Metodo para establecer la relacion bidireccional con propietario
    public void setPropietario(Propietario propietario) {
        // Si ya tenia un propietario, le quitamos la referencia
        if (this.propietario != null) {
            this.propietario.setComputadora(null);
        }
        
        this.propietario = propietario;
        
        // Establecemos la relacion bidireccional
        if (propietario != null) {
            propietario.setComputadora(this);
        }
    }
    
    // Getters y setters
    public String getMarca() { 
        return marca; 
    }
    
    public void setMarca(String marca) { 
        this.marca = marca; 
    }
    
    public String getNumeroSerie() { 
        return numeroSerie; 
    }
    
    public void setNumeroSerie(String numeroSerie) { 
        this.numeroSerie = numeroSerie; 
    }
    
    public Propietario getPropietario() { 
        return propietario; 
    }
    
    public PlacaMadre getPlacaMadre() { 
        return placaMadre; 
    }
    
    // Nota: No hay setPlacaMadre() porque es composicion - la placa nace con la computadora
    
    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie + 
               "', propietario=" + (propietario != null ? propietario.getNombre() : "sin propietario") + 
               ", placaMadre=" + placaMadre.getModelo() + "}";
    }
}
