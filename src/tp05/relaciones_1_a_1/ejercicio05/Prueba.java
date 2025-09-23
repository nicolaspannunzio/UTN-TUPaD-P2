/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio05;

/**
 *
 * @author nicol
 */
public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 5: COMPUTADORA - PLACA MADRE - PROPIETARIO ===\n");
        
        // Crear computadoras (automaticamente crean su placa madre por composicion)
        Computadora computadora1 = new Computadora("Dell", "DL123456789");
        Computadora computadora2 = new Computadora("HP", "HP987654321");
        Computadora computadora3 = new Computadora("Lenovo", "LV456789123");
        
        // Crear propietarios
        Propietario propietario1 = new Propietario("Laura Gonzalez", "23456789");
        Propietario propietario2 = new Propietario("Miguel Torres", "34567890");
        
        // Establecer relaciones bidireccionales (Computadora <-> Propietario)
        computadora1.setPropietario(propietario1);
        computadora2.setPropietario(propietario2);
        // computadora3 queda sin propietario
        
        // Verificar las relaciones
        System.out.println("=== INFORMACION DE LAS COMPUTADORAS ===");
        System.out.println(computadora1);
        System.out.println(computadora2);
        System.out.println(computadora3);
        
        System.out.println("\n=== INFORMACION DE LOS PROPIETARIOS ===");
        System.out.println(propietario1);
        System.out.println("Computadora: " + propietario1.getComputadora().getMarca() + " " + propietario1.getComputadora().getNumeroSerie());
        System.out.println(propietario2);
        System.out.println("Computadora: " + propietario2.getComputadora().getMarca() + " " + propietario2.getComputadora().getNumeroSerie());
        
        System.out.println("\n=== DEMOSTRANDO COMPOSICION ===");
        System.out.println("La placa madre se crea automaticamente con la computadora y no puede existir sin ella\n");
        
        System.out.println("Informacion de las placas madre:");
        System.out.println("• Computadora " + computadora1.getMarca() + " -> " + computadora1.getPlacaMadre());
        System.out.println("• Computadora " + computadora2.getMarca() + " -> " + computadora2.getPlacaMadre());
        System.out.println("• Computadora " + computadora3.getMarca() + " -> " + computadora3.getPlacaMadre());
        
        System.out.println("\nLa placa madre NO puede cambiar (composicion fuerte):");
        System.out.println("No existe setPlacaMadre() - la placa nace y muere con la computadora");
        
        System.out.println("\n=== DEMOSTRANDO ASOCIACION BIDIRECCIONAL ===");
        System.out.println("La computadora conoce al propietario Y el propietario conoce su computadora\n");
        
        System.out.println("Desde las computadoras:");
        System.out.println("• " + computadora1.getMarca() + " -> Propietario: " + computadora1.getPropietario().getNombre());
        System.out.println("• " + computadora2.getMarca() + " -> Propietario: " + computadora2.getPropietario().getNombre());
        
        System.out.println("\nDesde los propietarios:");
        System.out.println("• " + propietario1.getNombre() + " -> " + propietario1.getComputadora().getMarca());
        System.out.println("• " + propietario2.getNombre() + " -> " + propietario2.getComputadora().getMarca());
        
        System.out.println("\n=== CAMBIO DE PROPIETARIO (BIDIRECCIONAL) ===");
        System.out.println("Cambiando propietario de la computadora Dell...");
        System.out.println("Propietario anterior: " + computadora1.getPropietario().getNombre());
        
        // Cambiar propietario - SOLUCION CORRECTA para bidireccional
        Propietario propietarioAnterior = computadora1.getPropietario();
        computadora1.setPropietario(propietario2);
        
        System.out.println("Nuevo propietario: " + computadora1.getPropietario().getNombre());
        System.out.println("El propietario anterior ahora no tiene computadora: " + (propietarioAnterior.getComputadora() == null ? "null" : propietarioAnterior.getComputadora().getMarca()));
        System.out.println("Miguel ahora tiene la Dell: " + propietario2.getComputadora().getMarca());
        
        System.out.println("\n=== ASIGNAR COMPUTADORA SIN PROPIETARIO ===");
        System.out.println("Asignando la computadora Lenovo (que no tenia propietario) a Laura...");
        
        computadora3.setPropietario(propietario1);
        System.out.println("Laura ahora tiene: " + propietario1.getComputadora().getMarca());
        System.out.println("La Lenovo ahora pertenece a: " + computadora3.getPropietario().getNombre());
        
        System.out.println("\n=== DIFERENCIA COMPOSICION vs ASOCIACION ===");
        System.out.println("• COMPOSICION (PlacaMadre): NO se puede cambiar, nace y muere con la computadora");
        System.out.println("• ASOCIACION (Propietario): SI se puede cambiar, ambos pueden existir independientemente");
    }
}
