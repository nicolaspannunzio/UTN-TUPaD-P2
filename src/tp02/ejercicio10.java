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
public class ejercicio10 {
    
    /**
     * Actualiza el stock después de una venta y recepción de productos
     * @param stockActual Stock actual del producto
     * @param cantidadVendida Cantidad vendida (se resta del stock)
     * @param cantidadRecibida Cantidad recibida (se suma al stock)
     * @return Nuevo stock actualizado
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        
        // Llamar al método para actualizar el stock
        int stockActualizado = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + stockActualizado);
        
        scanner.close();
    }
}