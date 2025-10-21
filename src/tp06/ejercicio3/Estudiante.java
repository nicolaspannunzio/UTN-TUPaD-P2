/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio3;

/**
 *
 * @author nicol
 */

public class Estudiante {
    private String legajo;
    private String nombre;
    private String apellido;
    private int edad;
    private Carrera carrera;
    private double promedio;

    public Estudiante(String legajo, String nombre, String apellido, int edad, Carrera carrera, double promedio) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getLegajo() { return legajo; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public Carrera getCarrera() { return carrera; }
    public double getPromedio() { return promedio; }

    public void setPromedio(double promedio) { this.promedio = promedio; }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s (%d años) - %s | Promedio: %.2f",
                legajo, nombre, apellido, edad, carrera.name(), promedio);
    }
}
