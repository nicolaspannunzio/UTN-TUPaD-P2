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
public class mensajeError {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); 

        System.out.println("Hola, " + nombre);

        scanner.close(); 
    }
}

/*El método nextInt() sirve para leer números
enteros, no cadenas de texto.

En este caso queremos leer un nombre (texto),
entonces debemos usar nextLine() o next() en lugar de nextInt().*/

/*Ates: scanner.nextInt() intentaba leer un número entero en 
una variable String, lo cual no es válido.

Ahora: se usa scanner.nextLine(), que lee toda la línea de texto 
ingresada por el usuario (incluyendo espacios).

También agregamos scanner.close(); para cerrar el recurso 
y evitar advertencias.*/