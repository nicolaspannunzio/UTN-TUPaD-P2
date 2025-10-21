/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio2;

/**
 *
 * @author nicol
 */

public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private GeneroLibro genero;
    private boolean disponible;

    public Libro(String codigo, String titulo, String autor, int anioPublicacion, GeneroLibro genero, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.disponible = disponible;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public GeneroLibro getGenero() { return genero; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format("[%s] \"%s\" de %s (%d) - %s | %s",
                codigo, titulo, autor, anioPublicacion, genero.name(),
                (disponible ? "Disponible" : "Prestado"));
    }
}

