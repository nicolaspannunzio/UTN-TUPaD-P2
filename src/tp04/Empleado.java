/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04;

/**
 *
 * @author nicol
 */

public class Empleado {
    // Atributos de instancia
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estático - compartido por todas las instancias
    private static int totalEmpleados = 0;
    private static int siguienteId = 1;
    
    // Constructor sobrecargado #1: Recibe todos los parámetros
    public Empleado(int id, String nombre, String puesto, double salario) {
        // Uso de 'this' para distinguir parámetros de atributos
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa contador global
    }
    
    // Constructor sobrecargado #2: Solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        // Uso de 'this' para referenciar atributos de instancia
        this.id = siguienteId++; // ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0; // Salario por defecto
        totalEmpleados++; // Incrementa contador global
    }
    
    // Método sobrecargado #1: Actualizar salario por porcentaje
    public void actualizarSalario(double porcentaje) {
        // Aumenta el salario por el porcentaje especificado
        this.salario += this.salario * (porcentaje / 100);
    }
    
    // Método sobrecargado #2: Actualizar salario por cantidad fija
    public void actualizarSalario(int cantidadFija) {
        // Aumenta el salario por una cantidad fija
        this.salario += cantidadFija;
    }
    
    // Método toString() para representación legible del objeto
    @Override
    public String toString() {
        return String.format("Empleado{id=%d, nombre='%s', puesto='%s', salario=%.2f}", 
                           id, nombre, puesto, salario);
    }
    
    // Método estático: No necesita instancia para ejecutarse
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters adicionales para acceso controlado
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }
}
