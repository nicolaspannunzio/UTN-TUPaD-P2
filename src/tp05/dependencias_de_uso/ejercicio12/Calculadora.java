/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_uso.ejercicio12;

public class Calculadora {
    public void sumar(Impuesto impuesto) {
        Contribuyente c = impuesto.getContribuyente();
        System.out.println("Sumando sueldo de " + c.getNombre() + ": $" + c.getSueldo());
    }
}
