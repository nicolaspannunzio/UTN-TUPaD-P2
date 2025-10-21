/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio2;

/**
 *
 * @author nicol
 */

import java.util.List;
import java.util.Optional;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();

        // 1. Agregar al menos cinco libros
        biblio.agregarLibro(new Libro("L001", "1984", "George Orwell", 1949, GeneroLibro.FICCION, true));
        biblio.agregarLibro(new Libro("L002", "Breve historia del tiempo", "Stephen Hawking", 1988, GeneroLibro.CIENCIA, true));
        biblio.agregarLibro(new Libro("L003", "El diario de Ana Frank", "Ana Frank", 1947, GeneroLibro.HISTORIA, true));
        biblio.agregarLibro(new Libro("L004", "Cuentos para pensar", "Jorge Bucay", 2002, GeneroLibro.NO_FICCION, true));
        biblio.agregarLibro(new Libro("L005", "El Principito", "Antoine de Saint-Exupéry", 1943, GeneroLibro.INFANTIL, true));

        // 2. Listar libros
        System.out.println("=== Todos los libros ===");
        biblio.listarLibros();

        // 3. Buscar libro por código
        System.out.println("\n=== Buscar L003 ===");
        Libro buscado = biblio.buscarPorCodigo("L003");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por género
        System.out.println("\n=== Libros de CIENCIA ===");
        List<Libro> ciencia = biblio.filtrarPorGenero(GeneroLibro.CIENCIA);
        ciencia.forEach(Libro::mostrarInfo);

        // 5. Prestar libro
        System.out.println("\n=== Prestar L001 ===");
        biblio.prestarLibro("L001");

        // 6. Intentar volver a prestar el mismo libro
        biblio.prestarLibro("L001");

        // 7. Devolver libro
        System.out.println("\n=== Devolver L001 ===");
        biblio.devolverLibro("L001");

        // 8. Filtrar por autor
        System.out.println("\n=== Libros de George Orwell ===");
        biblio.filtrarPorAutor("George Orwell").forEach(Libro::mostrarInfo);

        // 9. Filtrar por año
        System.out.println("\n=== Libros del año 1949 ===");
        biblio.filtrarPorAnio(1949).forEach(Libro::mostrarInfo);

        // 10. Mostrar libro más antiguo
        System.out.println("\n=== Libro más antiguo ===");
        Optional<Libro> antiguo = biblio.obtenerMasAntiguo();
        antiguo.ifPresent(Libro::mostrarInfo);

        // 11. Mostrar géneros disponibles
        System.out.println("\n=== Géneros disponibles ===");
        biblio.mostrarGeneros();
    }
}

