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
public class ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        // utilizo double para incluir valores con decimales
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().charAt(0);
        // charAt se utiliza para capturar el primer caracter ingresado por el usuario
        
        double porcentajeDescuento = 0;
        double descuento = 0;
        double precioFinal = 0;
        
        if (categoria == 'A' || categoria == 'a') {
            porcentajeDescuento = 10;
        } else if (categoria == 'B' || categoria == 'b') {
            porcentajeDescuento = 15;
        } else if (categoria == 'C' || categoria == 'c') {
            porcentajeDescuento = 20;
        } else {
            System.out.println("Categoría inválida. Usando categoría C por defecto.");
        }
        
        descuento = precio * (porcentajeDescuento / 100);
        precioFinal = precio - descuento;
        
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Precio final: " + precioFinal);
        
        scanner.close();
    }
}
