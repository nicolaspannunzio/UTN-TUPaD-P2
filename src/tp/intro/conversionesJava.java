/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.intro;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class conversionesJava {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número entero: ");
            int a = sc.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int b = sc.nextInt();
            
            int resultado = a / b;
            System.out.println("Resultado (int): " + resultado);
        }
    }
}

