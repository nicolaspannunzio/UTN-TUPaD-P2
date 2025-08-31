/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
public class Libro {
    // ATRIBUTOS PRIVADOS - Solo accesibles desde dentro de la clase
    private String titulo;
    private String autor;
    private int anoPublicacion;
    
    // CONSTRUCTOR
    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        // Usar el setter para aplicar validación desde el constructor
        setAnoPublicacion(anoPublicacion);
    }
    
    // GETTERS - Métodos para OBTENER los valores de los atributos privados
    
    /**
     * Obtiene el título del libro
     * @return título del libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Obtiene el autor del libro
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Obtiene el año de publicación del libro
     * @return año de publicación
     */
    public int getAnoPublicacion() {
        return anoPublicacion;
    }
    
    // SETTER CON VALIDACIÓN - Método para MODIFICAR el año con reglas de negocio
    
    /**
     * Establece el año de publicación con validación
     * @param anoPublicacion Año de publicación (debe estar entre 1450 y año actual)
     */
    public void setAnoPublicacion(int anoPublicacion) {
        // Validación: año debe ser razonable (después de la imprenta y no futuro)
        if (anoPublicacion >= 1450 && anoPublicacion <= 2024) {
            this.anoPublicacion = anoPublicacion;
            System.out.println("Año de publicación actualizado correctamente: " + anoPublicacion);
        } else {
            System.out.println("Error: Año inválido (" + anoPublicacion + "). Debe estar entre 1450 y 2024.");
            System.out.println("El año actual se mantiene: " + this.anoPublicacion);
        }
    }
    
    // MÉTODO PARA MOSTRAR INFORMACIÓN
    
    /**
     * Muestra toda la información del libro
     */
    public void mostrarInfo() {
        System.out.println("=== Información del Libro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anoPublicacion);
        System.out.println("==============================");
    }
}
