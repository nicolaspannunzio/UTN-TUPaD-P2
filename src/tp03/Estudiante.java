/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp03;

/**
 *
 * @author nicol
 */
public class Estudiante {
    // ATRIBUTOS PRIVADOS
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // CONSTRUCTOR
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    // MÉTODOS PÚBLICOS
    
    /**
     * Muestra toda la información del estudiante
     */
    public void mostrarInfo() {
        System.out.println("=== Información del Estudiante ===");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("===================================");
    }
    
    /**
     * Aumenta la calificación del estudiante
     * @param puntos Puntos a sumar a la calificación
     */
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificación aumentada en " + puntos + " puntos.");
        System.out.println("Nueva calificación: " + calificacion);
    }
    
    /**
     * Disminuye la calificación del estudiante
     * @param puntos Puntos a restar de la calificación
     */
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificación disminuida en " + puntos + " puntos.");
        System.out.println("Nueva calificación: " + calificacion);
    }
}