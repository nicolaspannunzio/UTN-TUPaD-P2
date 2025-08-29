/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp02;

/**
 *
 * @author nicol
 */

public class ejercicio13 {

    // Función recursiva para mostrar los precios
    public static void mostrarPrecios(double[] precios, int indice) {
        // Caso base
        if (indice == precios.length) {
            return;
        }
        // Mostrar precio actual
        System.out.println("Precio: $" + precios[indice]);
        // Llamada recursiva
        mostrarPrecios(precios, indice + 1);
    }

    public static void main(String[] args) {
        // a. Declarar e inicializar array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        // c. Modificar un precio específico (tercer producto)
        precios[2] = 129.99;

        // d. Mostrar precios modificados
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }
}
