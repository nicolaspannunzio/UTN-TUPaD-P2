/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_uso.ejercicio11;

/**
 *
 * @author nicol
 */

public class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional
    
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    
    // Getters y setters
    public String getTitulo() { 
        return titulo; 
    }
    
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }
    
    public Artista getArtista() { 
        return artista; 
    }
    
    public void setArtista(Artista artista) { 
        this.artista = artista; 
    }
    
    @Override
    public String toString() {
        return "Cancion{titulo='" + titulo + "', artista=" + artista.getNombre() + "}";
    }
}