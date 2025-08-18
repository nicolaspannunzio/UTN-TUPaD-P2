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
public class conversiones2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número (decimal permitido): ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el segundo número (decimal permitido): ");
        double b = sc.nextDouble();

        double resultado = a / b; // División con decimales
        System.out.println("Resultado (double): " + resultado);

        sc.close();
    }
}
