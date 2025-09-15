/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_creacion.ejercicio13;

/**
 *
 * @author nicol
 */

public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 13: GENERADOR QR - USUARIO - CÓDIGO QR ===\n");
        
        // Crear usuarios
        Usuario usuario1 = new Usuario("Ana Garcia", "ana.garcia@email.com");
        Usuario usuario2 = new Usuario("Carlos Lopez", "carlos.lopez@empresa.com");
        Usuario usuario3 = new Usuario("Maria Rodriguez", "maria.rodriguez@universidad.edu");
        
        // Crear generador QR
        GeneradorQR generador = new GeneradorQR();
        
        System.out.println("DEMOSTRANDO DEPENDENCIA DE CREACION:");
        System.out.println("El GeneradorQR crea CódigoQR dentro del metodo pero no los almacena\n");
        
        // DEPENDENCIA DE CREACIÓN: GeneradorQR crea CódigoQR pero no los guarda
        System.out.println("--- Generacion 1 ---");
        generador.generar("https://www.ejemplo.com/perfil/ana", usuario1);
        System.out.println();
        
        System.out.println("--- Generacion 2 ---");
        generador.generar("VCARD:BEGIN\\nFN:Carlos López\\nEMAIL:carlos.lopez@empresa.com\\nEND", usuario2);
        System.out.println();
        
        System.out.println("--- Generacion 3 ---");
        generador.generar("WIFI:T:WPA;S:UniversidadWiFi;P:password123;;", usuario3);
        System.out.println();
        
        // Probamos casos de error
        System.out.println("PROBANDO CASOS DE ERROR:");
        System.out.println("--- Error: Valor vacío ---");
        generador.generar("", usuario1);
        System.out.println();
        
        System.out.println("--- Error: Usuario nulo ---");
        generador.generar("https://ejemplo.com", null);
        System.out.println();
        
        // Mostramos estadísticas del generador
        System.out.println("INFORMACION DEL GENERADOR:");
        generador.mostrarEstadisticas();
        System.out.println();
        
        System.out.println("DEMOSTRANDO ASOCIACION UNIDIRECCIONAL:");
        System.out.println("Creamos un CodigoQR independiente para mostrar la relacion\n");
        
        // Crear un CódigoQR independiente para demostrar la asociación
        CodigoQR qrIndependiente = new CodigoQR("Texto de ejemplo", usuario1);
        
        System.out.println("CodigoQR conoce al usuario:");
        System.out.println(" QR valor: " + qrIndependiente.getValor());
        System.out.println(" Usuario: " + qrIndependiente.getUsuario().getNombre());
        System.out.println(" Email: " + qrIndependiente.getUsuario().getEmail());
        
        System.out.println("\nUsuario NO conoce sus codigos QR:");
        System.out.println(" " + usuario1); // Solo muestra datos del usuario, no los QR
    }
}