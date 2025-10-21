/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp07.ejercicio3;

/**
 *
 * @author nicol
 */

public class MainEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new EmpleadoPlanta("Sofía", 80000, 15000);
        empleados[1] = new EmpleadoTemporal("Lucas", 50000, 10, 3000);
        empleados[2] = new EmpleadoPlanta("Tomás", 90000, 20000);

        for (Empleado e : empleados) {
            e.mostrarInfo();
            if (e instanceof EmpleadoPlanta) {
                System.out.println("→ Tipo: Planta Permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("→ Tipo: Temporal");
            }
            System.out.println();
        }
    }
}
