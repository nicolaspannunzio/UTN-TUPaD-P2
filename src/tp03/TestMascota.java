/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
public class TestMascota {
    public static void main(String[] args) {
        System.out.println("=== TESTING CLASE MASCOTA ===\n");
        
        // Crear una mascota
        Mascota mascota1 = new Mascota("Max", "Perro", 3);
        
        // Mostrar información inicial
        System.out.println("1. INFORMACIÓN INICIAL:");
        mascota1.mostrarInfo();
        
        // Simular el paso del tiempo (cumpleaños)
        System.out.println("\n2. SIMULANDO EL PASO DEL TIEMPO:");
        mascota1.cumplirAnios();
        
        System.out.println("\n--- Un año después ---");
        mascota1.cumplirAnios();
        
        // Verificar los cambios
        System.out.println("\n3. INFORMACIÓN DESPUÉS DE 2 AÑOS:");
        mascota1.mostrarInfo();
        
        System.out.println("\n=== CREANDO SEGUNDA MASCOTA ===\n");
        
        // Crear otra mascota para demostrar independencia
        Mascota mascota2 = new Mascota("Miau", "Gato", 1);
        mascota2.mostrarInfo();
        
        System.out.println("\n--- Miau cumple años ---");
        mascota2.cumplirAnios();
        
        System.out.println("\n=== ESTADO FINAL DE AMBAS MASCOTAS ===");
        System.out.println("Mascota 1:");
        mascota1.mostrarInfo();
        System.out.println("Mascota 2:");
        mascota2.mostrarInfo();
        
        System.out.println("¡Las mascotas mantienen su estado independiente! 🐾");
    }
}
