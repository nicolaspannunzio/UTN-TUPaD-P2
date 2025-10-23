/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08.excepciones;

/**
 *
 * @author nicol
 */

import java.util.Scanner;

public class MainExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) División segura
        System.out.println("Division segura: 10 / 2 = " + EjemplosExcepciones.dividirSeguro(10, 2));
        System.out.println("Division segura: 10 / 0 = " + EjemplosExcepciones.dividirSeguro(10, 0));

        // 2) Conversión de cadena a int
        System.out.print("Ingrese un numero (prueba convertirEntero, escriba 'abc' para error): ");
        String entrada = sc.nextLine();
        Integer valor = EjemplosExcepciones.convertirEntero(entrada);
        System.out.println("Resultado conversion: " + valor);

        // 3) Lectura de archivo
        System.out.println("\nLeyendo archivo de prueba 'prueba.txt' (colocar en la raiz del proyecto):");
        EjemplosExcepciones.leerArchivo("prueba.txt");

        // 4) Excepción personalizada
        System.out.print("\nIngrese una edad para validar: ");
        try {
            int edad = Integer.parseInt(sc.nextLine());
            EjemplosExcepciones.validarEdad(edad);
            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException ex) {
            System.out.println("Capturada EdadInvalidaException: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("No ingreso un numero valido.");
        }

        sc.close();
    }
}

