/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_uso.ejercicio11;

/**
 *
 * @author nicol
 */

public class Reproductor {
    
    // DEPENDENCIA DE USO: usa Cancion como parámetro pero NO la guarda
    public void reproducir(Cancion cancion) {
        if (cancion == null) {
            System.out.println("❌ No se puede reproducir: canción nula");
            return;
        }
        
        System.out.println("🎵 Reproduciendo...");
        System.out.println("   Título: " + cancion.getTitulo());
        System.out.println("   Artista: " + cancion.getArtista().getNombre());
        System.out.println("   Género: " + cancion.getArtista().getGenero());
        System.out.println("🎶 ♪♫♪ Música sonando... ♪♫♪");
        
        // Nota: NO guardamos la canción como atributo - solo la usamos
    }
    
    // Método adicional para demostrar que no almacena canciones
    public void detener() {
        System.out.println("⏹️ Reproducción detenida");
    }
}