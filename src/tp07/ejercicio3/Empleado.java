/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07.ejercicio3;

/**
 *
 * @author nicol
 */

public abstract class Empleado {
    protected String nombre;
    protected double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSueldo();

    public void mostrarInfo() {
        System.out.println(nombre + " - Sueldo: $" + calcularSueldo());
    }
}

