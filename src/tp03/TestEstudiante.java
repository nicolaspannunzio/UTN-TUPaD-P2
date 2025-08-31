/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
public class TestEstudiante {
    public static void main(String[] args) {
        System.out.println("=== TESTING CLASE ESTUDIANTE ===\n");
        
        // Crear un estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);
        
        // Mostrar información inicial
        System.out.println("1. INFORMACIÓN INICIAL:");
        estudiante1.mostrarInfo();
        
        // Probar modificaciones de calificación
        System.out.println("\n2. MODIFICANDO CALIFICACIONES:");
        
        // Subir calificación
        System.out.println("- Subiendo calificación:");
        estudiante1.subirCalificacion(1.0);
        
        // Bajar calificación
        System.out.println("\n- Bajando calificación:");
        estudiante1.bajarCalificacion(0.3);
        
        // Estado final
        System.out.println("\n3. ESTADO FINAL:");
        estudiante1.mostrarInfo();
        
        System.out.println("\n=== CREANDO SEGUNDO ESTUDIANTE ===\n");
        
        // Crear otro estudiante para demostrar que son independientes
        Estudiante estudiante2 = new Estudiante("María", "González", "Matemática I", 9.2);
        estudiante2.mostrarInfo();
        
        estudiante2.bajarCalificacion(0.5);
        
        System.out.println("\n=== COMPARACIÓN FINAL ===");
        System.out.println("Estudiante 1:");
        estudiante1.mostrarInfo();
        System.out.println("Estudiante 2:");
        estudiante2.mostrarInfo();
    }
}
