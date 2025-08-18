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
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresá tu nombre: ");
        String nombre = sc.nextLine(); 

        System.out.print("Ingresá tu edad: ");
        int edad = sc.nextInt(); 

        System.out.println("Tu nombre es " + nombre + " y tenés " + edad + " años.");

        sc.close();
    }
}
