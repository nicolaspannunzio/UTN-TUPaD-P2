/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_creacion.ejercicio14;

/**
 *
 * @author nicol
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;
    
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getDuracionMin() {
        return duracionMin;
    }
    
    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }
    
    @Override
    public String toString() {
        return "Proyecto: " + nombre + " (" + duracionMin + " minutos)";
    }
}