/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
public class TestLibro {
    public static void main(String[] args) {
        System.out.println("=== TESTING ENCAPSULAMIENTO - CLASE LIBRO ===\n");
        
        // Crear un libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        
        // Mostrar información inicial
        System.out.println("1. INFORMACIÓN INICIAL:");
        libro1.mostrarInfo();
        
        // Probar los GETTERS
        System.out.println("\n2. USANDO GETTERS:");
        System.out.println("Título obtenido: " + libro1.getTitulo());
        System.out.println("Autor obtenido: " + libro1.getAutor());
        System.out.println("Año obtenido: " + libro1.getAnoPublicacion());
        
        // Probar SETTER con valor INVÁLIDO
        System.out.println("\n3. PROBANDO VALIDACIÓN - VALOR INVÁLIDO:");
        libro1.setAnoPublicacion(3000); // Año futuro - inválido
        
        System.out.println("\n4. INFORMACIÓN DESPUÉS DEL INTENTO INVÁLIDO:");
        libro1.mostrarInfo(); // Debe mantener el año original
        
        // Probar SETTER con otro valor INVÁLIDO
        System.out.println("\n5. PROBANDO OTRA VALIDACIÓN - VALOR MUY ANTIGUO:");
        libro1.setAnoPublicacion(1200); // Muy antiguo - inválido
        
        // Probar SETTER con valor VÁLIDO
        System.out.println("\n6. PROBANDO VALIDACIÓN - VALOR VÁLIDO:");
        libro1.setAnoPublicacion(1970); // Valor válido
        
        // Mostrar información final
        System.out.println("\n7. INFORMACIÓN FINAL:");
        libro1.mostrarInfo();
        
        System.out.println("\n=== CREANDO SEGUNDO LIBRO CON AÑO INVÁLIDO ===\n");
        
        // Demostrar que la validación funciona también en el constructor
        Libro libro2 = new Libro("Libro del Futuro", "Autor Desconocido", 2050);
        libro2.mostrarInfo();
        
        System.out.println("\n=== DEMOSTRANDO ENCAPSULAMIENTO ===");
        System.out.println("✅ Los atributos son PRIVADOS - no se pueden acceder directamente");
        System.out.println("✅ Los GETTERS permiten LEER los valores");
        System.out.println("✅ Los SETTERS permiten ESCRIBIR con VALIDACIÓN");
        System.out.println("✅ La clase controla cómo se modifican sus datos");
    }
    
}
