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
public class ejercicio11 {
    
    // VARIABLE GLOBAL (estática) - Accesible desde todos los métodos de la clase
    private static final double DESCUENTO_ESPECIAL = 0.10;  // 10%
    
    /**
     * Calcula el descuento especial usando la variable global
     * @param precio Precio original del producto
     */
    public static void calcularDescuentoEspecial(double precio) {
        // VARIABLE LOCAL - Solo existe dentro de este método
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        // Llamar al método que usa la variable global
        calcularDescuentoEspecial(precio);
        
        scanner.close();
    }
}