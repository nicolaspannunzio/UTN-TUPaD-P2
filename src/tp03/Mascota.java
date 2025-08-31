/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
public class Mascota {
     // ATRIBUTOS PRIVADOS
    private String nombre;
    private String especie;
    private int edad;
    
    // CONSTRUCTOR
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    // MÉTODOS PÚBLICOS
    
    /**
     * Muestra toda la información de la mascota
     */
    public void mostrarInfo() {
        System.out.println("=== Información de la Mascota ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("==================================");
    }
    
    /**
     * Simula el cumpleaños de la mascota (aumenta la edad en 1 año)
     */
    public void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños " + nombre + "! 🎉");
        System.out.println("Ahora tiene " + edad + " años.");
    }
}
