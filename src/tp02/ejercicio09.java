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
public class ejercicio09 {
    
    /**
     * Calcula el costo de envío basado en la zona y el peso
     * @param peso Peso del paquete en kg
     * @param zona Zona de envío (Nacional o Internacional)
     * @return Costo de envío calculado
     */
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;
        
        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona no válida. Usando tarifa nacional por defecto.");
            costoPorKg = 5.0;
        }
        
        return peso * costoPorKg;
    }
    
    /**
     * Calcula el total de la compra (producto + envío)
     * @param precioProducto Precio del producto
     * @param costoEnvio Costo de envío
     * @return Total a pagar
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();
        
        // Composición: un método llama a otro
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
        scanner.close();
    }
}