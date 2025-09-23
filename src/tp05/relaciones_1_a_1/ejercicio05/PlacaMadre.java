/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio05;

/**
 *
 * @author nicol
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;
    
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    // Getters y setters
    public String getModelo() { 
        return modelo; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    
    public String getChipset() { 
        return chipset; 
    }
    
    public void setChipset(String chipset) { 
        this.chipset = chipset; 
    }
    
    @Override
    public String toString() {
        return "PlacaMadre{modelo='" + modelo + "', chipset='" + chipset + "'}";
    }
}
