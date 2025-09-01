/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04;

/**
 *
 * @author nicol
 */
public class PruebaEmpleados {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE EMPLEADOS ===\n");
        
        // Crear empleados usando constructor completo
        System.out.println("1. Creando empleados con constructor completo:");
        Empleado emp1 = new Empleado(100, "Juan Perez", "Desarrollador Senior", 75000.0);
        Empleado emp2 = new Empleado(101, "Maria Garcia", "Analista de Sistemas", 65000.0);
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados() + "\n");
        
        // Crear empleados usando constructor simplificado
        System.out.println("2. Creando empleados con constructor simplificado:");
        Empleado emp3 = new Empleado("Carlos Lopez", "Programador Junior");
        Empleado emp4 = new Empleado("Ana Martinez", "Tester QA");
        
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados() + "\n");
        
        // Probar métodos sobrecargados actualizarSalario
        System.out.println("3. Aplicando aumentos de salario:");
        
        // Aumento por porcentaje (método sobrecargado con double)
        System.out.println("\nAntes del aumento por porcentaje:");
        System.out.println(emp1);
        emp1.actualizarSalario(15.0); // 15% de aumento
        System.out.println("Después del aumento de 15%:");
        System.out.println(emp1);
        
        // Aumento por cantidad fija (método sobrecargado con int)
        System.out.println("\nAntes del aumento por cantidad fija:");
        System.out.println(emp3);
        emp3.actualizarSalario(5000); // $5000 de aumento
        System.out.println("Despues del aumento de $5000:");
        System.out.println(emp3);
        
        // Aplicar diferentes tipos de aumentos a otros empleados
        emp2.actualizarSalario(10.0); // 10% de aumento
        emp4.actualizarSalario(3000); // $3000 de aumento
        
        // Mostrar estado final de todos los empleados
        System.out.println("\n4. Estado final de todos los empleados:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        // Mostrar total final usando método estático
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // Demostrar que el método estático se puede llamar sin instancia
        System.out.println("Verificacion con metodo estatico: " + Empleado.mostrarTotalEmpleados());
    }
}