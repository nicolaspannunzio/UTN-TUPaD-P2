/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp02;
import java.util.Scanner;

/**
 *
 * @author nicolas
 */
public class ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese un numero mas: ");
        int num3 = scanner.nextInt();
        
        if (num1 > num2 ) {
            if (num1 > num3) {
                System.out.println("El número ingresado es el mayor " + num1);
            } else {
                System.out.println("El número ingresado es el mayor " + num3);
            }
        } else {
            if (num2 > num3) {
            System.out.println("El número ingresado es el mayor " + num2);
            } else {
             System.out.println("El número ingresado es el mayor " + num3);
            }
        }
    }
}
