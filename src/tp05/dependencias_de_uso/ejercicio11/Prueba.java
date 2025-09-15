/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_uso.ejercicio11;

/**
 *
 * @author nicol
 */

public class Prueba {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 11: REPRODUCTOR - CANCION - ARTISTA ===\n");
        
        // Crear artistas
        Artista artista1 = new Artista("Gustavo Cerati", "Rock");
        Artista artista2 = new Artista("Charly Garcia", "Rock Nacional");
        Artista artista3 = new Artista("Mercedes Sosa", "Folklore");
        
        // Crear canciones con asociación unidireccional a artista
        Cancion cancion1 = new Cancion("Crimen", artista1);
        Cancion cancion2 = new Cancion("Demoliendo Hoteles", artista2);
        Cancion cancion3 = new Cancion("Alfonsina y el Mar", artista3);
        
        // Crear reproductor
        Reproductor reproductor = new Reproductor();
        
        System.out.println("DEMOSTRANDO DEPENDENCIA DE USO:");
        System.out.println("El reproductor usa las canciones pero no las almacena\n");
        
        // Usar el reproductor con diferentes canciones (DEPENDENCIA DE USO)
        reproductor.reproducir(cancion1);
        System.out.println();
        
        reproductor.reproducir(cancion2);
        System.out.println();
        
        reproductor.reproducir(cancion3);
        System.out.println();
        
        // Demostrar que también maneja casos especiales
        System.out.println("PROBANDO CASO ESPECIAL:");
        reproductor.reproducir(null);
        System.out.println();
        
        reproductor.detener();
        System.out.println();
        
        System.out.println("DEMOSTRANDO ASOCIACION UNIDIRECCIONAL:");
        System.out.println("La canción conoce a su artista, pero el artista NO conoce sus canciones\n");
        
        System.out.println("Informacion desde la cancion:");
        System.out.println(" " + cancion1.getTitulo() + " → " + cancion1.getArtista().getNombre());
        System.out.println(" " + cancion2.getTitulo() + " → " + cancion2.getArtista().getNombre());
        System.out.println(" " + cancion3.getTitulo() + " → " + cancion3.getArtista().getNombre());
        
        System.out.println("\nInformacion del artista (NO conoce sus canciones):");
        System.out.println(" " + artista1); // Solo muestra sus datos, no las canciones
        System.out.println(" " + artista2);
        System.out.println(" " + artista3);
    }
}