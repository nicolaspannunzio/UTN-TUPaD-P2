/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio02;

/**
 *
 * @author nicol
 */
public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: CELULAR - BATERIA - USUARIO ===\n");
        
        // Crear baterias (pueden existir independientemente)
        Bateria bateria1 = new Bateria("Li-Ion 4000", "4000mAh");
        Bateria bateria2 = new Bateria("Li-Po 3500", "3500mAh");
        
        // Crear celular
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21");
        
        // Crear usuario
        Usuario usuario = new Usuario("Juan Perez", "12345678");
        
        // Establecer relacion de agregacion (Celular -> Bateria)
        celular.setBateria(bateria1);
        
        // Establecer relacion bidireccional (Celular <-> Usuario)
        celular.setUsuario(usuario);
        
        // Verificar las relaciones
        System.out.println("=== INFORMACION DEL CELULAR ===");
        System.out.println(celular);
        
        System.out.println("\n=== INFORMACION DEL USUARIO ===");
        System.out.println(usuario);
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
        
        System.out.println("\n=== INFORMACION DE LA BATERIA ===");
        System.out.println(celular.getBateria());
        
        System.out.println("\n=== DEMOSTRANDO AGREGACION ===");
        System.out.println("La bateria puede existir independientemente del celular");
        
        // Cambiar bateria (agregacion permite esto)
        System.out.println("Cambiando bateria...");
        celular.setBateria(bateria2);
        System.out.println("Nueva bateria: " + celular.getBateria());
        
        // La bateria original sigue existiendo
        System.out.println("Bateria original sigue existiendo: " + bateria1);
        
        System.out.println("\n=== DEMOSTRANDO ASOCIACION BIDIRECCIONAL ===");
        System.out.println("Cambio de usuario...");
        
        Usuario usuario2 = new Usuario("Maria Rodriguez", "87654321");
        celular.setUsuario(usuario2);
        
        System.out.println("Nuevo usuario del celular: " + celular.getUsuario().getNombre());
        System.out.println("Celular del nuevo usuario: " + usuario2.getCelular().getMarca());
        System.out.println("Usuario anterior ya no tiene celular: " + (usuario.getCelular() == null ? "null" : usuario.getCelular()));
    }
}
