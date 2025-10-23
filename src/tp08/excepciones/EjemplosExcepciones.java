/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08.excepciones;

/**
 *
 * @author nicol
 */

import java.io.*;
import java.util.Scanner;

public class EjemplosExcepciones {

    // División segura
    public static double dividirSeguro(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Error: división por cero.");
            return Double.NaN;
        }
    }

    // Conversión segura String->int
    public static Integer convertirEntero(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException ex) {
            System.out.println("Error: formato inválido para entero: " + texto);
            return null;
        }
    }

    // Leer archivo con try-with-resources
    public static void leerArchivo(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado: " + ruta);
        } catch (IOException ex) {
            System.out.println("Error de E/S al leer el archivo: " + ex.getMessage());
        }
    }

    // Validar edad con excepción personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
    }
}

