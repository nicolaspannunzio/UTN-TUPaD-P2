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
public class operacionesBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   

        System.out.print("Ingresá el primer número entero: ");
        int a = sc.nextInt();                  

        System.out.print("Ingresá el segundo número entero: ");
        int b = sc.nextInt();

        int suma = a + b;                      
        int resta = a - b;                     
        int multiplicacion = a * b;            

        double division = (double) a / b;      

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        sc.close();                             
    }
}
