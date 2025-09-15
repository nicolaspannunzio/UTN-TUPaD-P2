/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio01;

/**
 *
 * @author nicol
 */

public class Prueba {
    public static void main(String[] args) {
        // Crear pasaporte (automáticamente crea su foto por composición)
        Pasaporte pasaporte = new Pasaporte("AB123456", "2024-01-15");
        
        // Crear titular
        Titular titular = new Titular("Juan Perez", "12345678");
        
        // Establecer relación bidireccional
        pasaporte.setTitular(titular);
        
        // Verificar las relaciones
        System.out.println("=== INFORMACION DEL PASAPORTE ===");
        System.out.println(pasaporte);
        
        System.out.println("\n=== INFORMACION DEL TITULAR ===");
        System.out.println(titular);
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
        
        System.out.println("\n=== INFORMACION DE LA FOTO ===");
        System.out.println(pasaporte.getFoto());
    }
}