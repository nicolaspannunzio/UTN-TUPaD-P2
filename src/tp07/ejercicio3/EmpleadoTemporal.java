/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07.ejercicio3;

/**
 *
 * @author nicol
 */

public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados;
    private double pagoPorDia;

    public EmpleadoTemporal(String nombre, double sueldoBase, int diasTrabajados, double pagoPorDia) {
        super(nombre, sueldoBase);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (diasTrabajados * pagoPorDia);
    }
}

