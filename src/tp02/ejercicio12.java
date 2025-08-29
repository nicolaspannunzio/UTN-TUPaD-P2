/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp02;

/**
 *
 * @author nicol
 */
public class ejercicio12 {
    
    public static void main(String[] args) {
        // a. Declarar e inicializar array con precios de productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar valores originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios);
        
        // c. Modificar el precio de un producto específico (índice 2 = tercer elemento)
        precios[2] = 129.99;  // Cambiamos $149.75 por $129.99
        
        // d. Mostrar valores modificados
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }
    
    /**
     * Método auxiliar para mostrar todos los precios del array
     * @param precios Array de precios a mostrar
     */
    public static void mostrarPrecios(double[] precios) {
        // Recorrido con for-each (enhanced for loop)
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        System.out.println(); // Línea en blanco para separar
    }
}
