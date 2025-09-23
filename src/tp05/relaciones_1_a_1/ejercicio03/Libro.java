/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.relaciones_1_a_1.ejercicio03;

/**
 *
 * @author nicol
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;        // Asociacion unidireccional
    private Editorial editorial; // Agregacion
    
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    // Getters y setters
    public String getTitulo() { 
        return titulo; 
    }
    
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }
    
    public String getIsbn() { 
        return isbn; 
    }
    
    public void setIsbn(String isbn) { 
        this.isbn = isbn; 
    }
    
    public Autor getAutor() { 
        return autor; 
    }
    
    public void setAutor(Autor autor) { 
        this.autor = autor; 
    }
    
    public Editorial getEditorial() { 
        return editorial; 
    }
    
    public void setEditorial(Editorial editorial) { 
        this.editorial = editorial; 
    }
    
    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', isbn='" + isbn + 
               "', autor=" + (autor != null ? autor.getNombre() : "sin autor") + 
               ", editorial=" + (editorial != null ? editorial.getNombre() : "sin editorial") + "}";
    }
}