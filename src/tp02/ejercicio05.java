/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp02;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = 1; // Inicializamos con cualquier valor diferente de 0
        int sumaPares = 0;
        
        while (numero != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            
            // Solo sumamos si es par y no es 0
            if (numero != 0 && numero % 2 == 0) {
                sumaPares += numero;
            }
        }
        
        System.out.println("La suma de los números pares es: " + sumaPares);
        
        scanner.close();
    }
}
