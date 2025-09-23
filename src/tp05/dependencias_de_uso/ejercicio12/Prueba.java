/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp05.dependencias_de_uso.ejercicio12;

public class Prueba {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Nicolas", 85000);
        Impuesto i = new Impuesto(c);
        Calculadora calc = new Calculadora();
        calc.sumar(i);
    }
}

