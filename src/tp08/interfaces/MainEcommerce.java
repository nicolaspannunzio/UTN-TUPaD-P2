/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08.interfaces;

/**
 *
 * @author nicol
 */

public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nicolás", "nico@ejemplo.com");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Auriculares", 2500));
        pedido.agregarProducto(new Producto("Mouse", 1200));
        pedido.mostrarProductos();

        double total = pedido.calcularTotal();
        System.out.println("Total pedido: $" + total);

        // Pagar con tarjeta (con descuento)
        TarjetaCredito tarjeta = new TarjetaCredito("Nicolás", "1234-5678-9012-3456");
        double totalConDescuento = tarjeta.aplicarDescuento(total, 10); // 10%
        boolean ok = tarjeta.procesarPago(totalConDescuento);
        if (ok) {
            pedido.cambiarEstado("PAGADO");
            System.out.println("Pago exitoso con tarjeta.");
        } else {
            System.out.println("Pago rechazado con tarjeta.");
        }

        // Alternativa: PayPal
        PayPal paypal = new PayPal("nico@paypal");
        if (paypal.procesarPago(total)) {
            pedido.cambiarEstado("PAGADO");
            System.out.println("Pago exitoso con PayPal.");
        } else {
            System.out.println("Pago rechazado con PayPal.");
        }
    }
}
