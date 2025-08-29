/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp02;

import java.util.Scanner;

public class ejercicio08 {
    
    /**
     * Calcula el precio final de un producto aplicando impuesto y descuento
     * @param precioBase Precio original del producto
     * @param impuesto Porcentaje de impuesto (ejemplo: 10 para 10%)
     * @param descuento Porcentaje de descuento (ejemplo: 5 para 5%)
     * @return Precio final calculado
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double montoImpuesto = precioBase * (impuesto / 100);
        double montoDescuento = precioBase * (descuento / 100);
        double precioFinal = precioBase + montoImpuesto - montoDescuento;
        
        return precioFinal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();
        
        // Llamar al método y guardar el resultado
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
        
        scanner.close();
    }
}
