/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio03;

/**
 *
 * @author nicol
 */
public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: LIBRO - AUTOR - EDITORIAL ===\n");
        
        // Crear autores
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("Isabel Allende", "Chilena");
        
        // Crear editoriales (pueden existir independientemente)
        Editorial editorial1 = new Editorial("Planeta", "Av. Independencia 1682, Buenos Aires");
        Editorial editorial2 = new Editorial("Sudamericana", "Humberto Primo 555, Buenos Aires");
        Editorial editorial3 = new Editorial("Alfaguara", "Leandro N. Alem 720, Buenos Aires");
        
        // Crear libros
        Libro libro1 = new Libro("Cien Anos de Soledad", "978-84-376-0494-7");
        Libro libro2 = new Libro("El Aleph", "978-84-376-0495-4");
        Libro libro3 = new Libro("La Casa de los Espiritus", "978-84-376-0496-1");
        
        // Establecer relaciones unidireccionales (Libro -> Autor)
        libro1.setAutor(autor1);
        libro2.setAutor(autor2);
        libro3.setAutor(autor3);
        
        // Establecer relaciones de agregacion (Libro -> Editorial)
        libro1.setEditorial(editorial1);
        libro2.setEditorial(editorial2);
        libro3.setEditorial(editorial3);
        
        // Verificar las relaciones
        System.out.println("=== INFORMACION DE LOS LIBROS ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        
        System.out.println("\n=== DEMOSTRANDO ASOCIACION UNIDIRECCIONAL ===");
        System.out.println("El libro conoce a su autor, pero el autor NO conoce sus libros\n");
        
        System.out.println("Informacion desde los libros:");
        System.out.println("• " + libro1.getTitulo() + " -> " + libro1.getAutor().getNombre() + " (" + libro1.getAutor().getNacionalidad() + ")");
        System.out.println("• " + libro2.getTitulo() + " -> " + libro2.getAutor().getNombre() + " (" + libro2.getAutor().getNacionalidad() + ")");
        System.out.println("• " + libro3.getTitulo() + " -> " + libro3.getAutor().getNombre() + " (" + libro3.getAutor().getNacionalidad() + ")");
        
        System.out.println("\nInformacion de los autores (NO conocen sus libros):");
        System.out.println("• " + autor1); // Solo muestra datos del autor, no los libros
        System.out.println("• " + autor2);
        System.out.println("• " + autor3);
        
        System.out.println("\n=== DEMOSTRANDO AGREGACION ===");
        System.out.println("Las editoriales pueden existir independientemente de los libros");
        
        System.out.println("\nInformacion desde los libros:");
        System.out.println("• " + libro1.getTitulo() + " -> " + libro1.getEditorial().getNombre());
        System.out.println("• " + libro2.getTitulo() + " -> " + libro2.getEditorial().getNombre());
        System.out.println("• " + libro3.getTitulo() + " -> " + libro3.getEditorial().getNombre());
        
        System.out.println("\nLas editoriales siguen existiendo independientemente:");
        System.out.println("• " + editorial1);
        System.out.println("• " + editorial2);
        System.out.println("• " + editorial3);
        
        System.out.println("\n=== CAMBIO DE EDITORIAL (AGREGACION) ===");
        System.out.println("Cambiando editorial de '" + libro1.getTitulo() + "'...");
        System.out.println("Editorial anterior: " + libro1.getEditorial().getNombre());
        
        // Cambiar editorial (agregacion permite esto)
        libro1.setEditorial(editorial2);
        System.out.println("Nueva editorial: " + libro1.getEditorial().getNombre());
        
        // La editorial original sigue existiendo
        System.out.println("Editorial original sigue existiendo: " + editorial1.getNombre());
        
        System.out.println("\n=== CAMBIO DE AUTOR (ASOCIACION UNIDIRECCIONAL) ===");
        System.out.println("Cambiando autor de '" + libro2.getTitulo() + "'...");
        System.out.println("Autor anterior: " + libro2.getAutor().getNombre());
        
        libro2.setAutor(autor1);
        System.out.println("Nuevo autor: " + libro2.getAutor().getNombre());
        
        // El autor original sigue existiendo (no sabia del libro de todos modos)
        System.out.println("Autor original sigue existiendo: " + autor2.getNombre());
    }
}